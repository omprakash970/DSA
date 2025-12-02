/**
 * Problem (clear version):
 *
 * Write a recursive function that converts a positive integer into a space-separated
 * string of English words for each digit (from most-significant to least-significant).
 *
 * Example:
 *   Input:  2019
 *   Output: "two zero one nine"
 *
 * Constraints:
 *  - Each digit is in the range 0..9.
 *  - The least-significant digit (last digit) will never be 0.
 *
 * Requirement:
 *  - The solution must use recursion to process the digits in the correct order.
 *
 * Suggested method signature:
 *   public static String digitsToWords(int n)
 */
public class problem6 {
    private static final String[] WORDS = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    /**
     * Public entry: converts a positive integer to space-separated words for each digit.
     * Returns "zero" for input 0.
     */
    public static String digitsToWords(int n) {
        if (n == 0) return WORDS[0];
        return digitsToWordsRecursive(n);
    }

    // Helper that assumes n > 0 and builds the string in the correct order via recursion.
    private static String digitsToWordsRecursive(int n) {
        if (n < 10) {
            return WORDS[n];
        }
        return digitsToWordsRecursive(n / 10) + " " + WORDS[n % 10];
    }

    public static void main(String[] args) {
        int n = 2019;
        System.out.println(digitsToWords(n)); // prints: two zero one nine
    }
}
