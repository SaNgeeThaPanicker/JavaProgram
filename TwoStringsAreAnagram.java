import java.util.Arrays;
import java.util.HashMap;

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

    //Alternative approach using HashMap

    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s1.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for(char c : s2.toCharArray()){
            if(!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if(map.get(c) == 0) map.remove(c);
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {
        anagramCheck("listen", "silent");
        anagramCheck("hello", "world");
    }

}
