/**
 * Implementation of a weak hash function.
 */
class WeakHash implements HashFunction {
  /**
   * Calculates the weak hash value of the given string.
   *
   * @param str The input string
   * @return The weak hash value
   */
  @Override
  public int hash(String str) {
    // Counting unique characters
    HashFunction weakHash =
            line -> {
              int uniqueChars = 0;
              boolean[] seen = new boolean[65536];

              for (char c : str.toCharArray()) {
                if (!seen[c]) {
                  seen[c] = true;
                  uniqueChars++;
                }
              }
              return uniqueChars;
            };
    return weakHash.hash(str);
  }
}