package Practise;

public class Palindrome_CodingNinja {

    	public static boolean checkPalindrome(String str) {
	
	    // WRITE YOUR CODE HERE	
		char[] newChar = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        System.out.println("Character array: " + newChar.toString());

        int left = 0;
        int right = newChar.length - 1;

        while (left < right) {
            if (newChar[left] != newChar[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
		
	 
	}

    public static void main(String[] args) {
        String str = "c1 O$d@eeD o1c";
        boolean isPalindrome = checkPalindrome(str);
        System.out.println(isPalindrome);
    }
}
