/**
 * Implementation of a strong hash function.
 */
class StrongHash implements HashFunction {
  /**
   * Calculates the strong hash value of the given string.
   *
   * @param str The input string
   * @return The strong hash value
   */
  @Override
  public int hash(String str) {
    HashFunction strongHash = line -> {
      int hashValue = 0;

      for (int i = 0; i < str.length(); i++) {
        hashValue += (int) str.charAt(i) * (i + 1);
      }
      return hashValue;
    };
    return strongHash.hash(str);
  }
}