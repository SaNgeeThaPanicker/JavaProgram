import java.util.Arrays;

public class TwoStringsAreAnagram {

    public static void anagramCheck(String str1, String str2)
    {
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1, charArray2)){
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static void main(String[] args) {
        anagramCheck("listen", "silent");
        anagramCheck("hello", "world");
    }

}
