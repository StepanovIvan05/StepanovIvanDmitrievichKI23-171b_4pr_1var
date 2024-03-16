import java.util.Objects;
import java.util.Scanner;

// Интерфейс для вычисления хэша от строки
interface HashFunction {
  int hash(String str);
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean isBreak = false, isCalculated = false;
    String input = "", choice;
    int weakResult = 0, strongResult = 0;
    //меню
    while (!isBreak) {
      System.out.println(
          """
              Menu:
              1.Entering string
              2.Calculate hash
              3.Display hash
              4.Exit
              (1-4):""");
      choice = scanner.nextLine();
      switch (choice) {
        case "1":
          System.out.print("Enter the string: ");
          input = scanner.nextLine();
          isCalculated = false;
          isEmpty(input);
          break;
        case "2":
          if (isEmpty(input)) {
            break;
          }
          HashFunction weakHash = new WeakHash();
          HashFunction strongHash = new StrongHash();

          weakResult = weakHash.hash(input);
          strongResult = strongHash.hash(input);
          isCalculated = true;
          System.out.println("Hash is calculated");
          break;
        case "3":
          if (!isCalculated) {
            System.out.println("Result is not calculated");
            break;
          }
          System.out.println("Weak hash: " + weakResult);
          System.out.println("Strong Hash: " + strongResult);
          break;
        case "4":
          isBreak = true;
          break;
        default:
          System.out.println("Incorrect choice");
      }
    }
  }

  //проверка: пустая ли строка
  static boolean isEmpty(String input) {
    if (Objects.equals(input, "")) {
      System.out.println("Empty string");
      return true;
    }
    return false;
  }
}
