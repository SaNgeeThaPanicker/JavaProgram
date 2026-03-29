

public class CountVowelsAndConstantsInAString {
    public static void countVowelsAndConstantsInAString(String str) {

        char[] characters = str.toCharArray();
        int vowelCount = 0;
        int consonantCount = 0;

        for(char c:characters){
            if(Character.isAlphabetic(c))
            {
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                    vowelCount++;
                else
                    consonantCount++;
            }
        }
        System.out.println("Total number of vowels in the string: " + vowelCount);
        System.out.println("Total number of consonants in the string: " + consonantCount);
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        countVowelsAndConstantsInAString(str);
    }
}
