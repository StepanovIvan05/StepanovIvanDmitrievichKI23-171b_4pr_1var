//Вычисление слабого хэша строки
class WeakHash implements HashFunction {
  @Override
  public int hash(String str) {
    // Подсчет уникальных символов
    int uniqueChars = 0;
    boolean[] seen = new boolean[65536];

    for (char c : str.toCharArray()) {
      if (!seen[c]) {
        seen[c] = true;
        uniqueChars++;
      }
    }
    return uniqueChars;
  }
}
