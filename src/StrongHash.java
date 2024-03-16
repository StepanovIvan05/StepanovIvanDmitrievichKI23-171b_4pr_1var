//Вычисление сильного хэша строки
class StrongHash implements HashFunction {
  @Override
  public int hash(String str) {
    int hashValue = 0;

    for (int i = 0; i < str.length(); i++) {
      hashValue += (int) str.charAt(i) * (i + 1);
    }
    return hashValue;
  }
}