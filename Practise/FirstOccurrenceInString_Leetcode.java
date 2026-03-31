package Practise;

public class FirstOccurrenceInString_Leetcode {
    public static void main(String[] args) {
        String haystack = "hello world";
        String needle = "world";
        int index = 0;

        if(needle.isEmpty() || haystack.isEmpty())
            {System.out.println("Needle or haystack cannot be empty.");}
        else if(needle == null || haystack == null)
            System.out.println("Needle or haystack cannot be null.");
        else
            index = strStr(haystack, needle);
        System.out.println("First occurrence of '" + needle + "' in '" + haystack + "' is at index: " + index);
    }

    public static int strStr(String haystack, String needle) {
    if (needle.isEmpty()) return 0;
    
    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
        // If the first character matches, start checking the rest
        if (haystack.charAt(i) == needle.charAt(0)) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) return i;
        }
    }
    return -1;
}
}
