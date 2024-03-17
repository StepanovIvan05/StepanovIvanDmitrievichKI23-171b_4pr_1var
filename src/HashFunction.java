/**
 * Interface for calculating hash of a string.
 */
interface HashFunction {
  /**
   * Calculates the hash value of the given string.
   *
   * @param str The input string
   * @return The hash value
   */
  int hash(String str);
}
