public class PermutationOnGivenString {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("Permutations of " + str + ":");
        findPermutations(str, 0, str.length() - 1);
    }

    /**
     * Recursive function to find permutations
     * @param str - The string to permute
     * @param left - Starting index
     * @param right - Ending index
     */
    private static void findPermutations(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                // Swap the current character to the "fixed" position
                str = swap(str, left, i);
                
                // Recursively call for the remaining characters
                findPermutations(str, left + 1, right);
                
                // Backtrack: Swap back to restore the original string for the next loop
                str = swap(str, left, i);
            }
        }
    }

    // Helper method to swap characters in a string
    private static String swap(String a, int i, int j) {
        char[] charArray = a.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
