public class StringIsPalindrome {

    public static void main(String[] args) {
        String str = "1madam1";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
     private static boolean isPalindrome(String str) {
        StringBuilder reversedStr = new StringBuilder(str).reverse();
        if(str.equals(reversedStr.toString())) {
            return true;
        }
        return false; // Placeholder for palindrome logic
    }
}
