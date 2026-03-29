package Practise;

import java.util.HashMap;

public class StringQuestions {

    public static void main(String[] args) {
        
        // countEachCharacterInAString("hell12o world");
        // countEachOccurrenceOfEachCharacterInAString("javaj java");
        // countNumberOfWordsInAString("hello world this is java");
        countVowelsAndConsonantsInAString("hello world this is java");
    }

    
    public static void countVowelsAndConsonantsInAString(String str){
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

    public static void countNumberOfWordsInAString(String str){
        String[] words = str.split(" ");
        int count=0;
        for(String word:words){
            if(!word.isEmpty())
                count++;
        }
        System.out.println("Total number of words in the string: " + count);
    }

    public static void countEachOccurrenceOfEachCharacterInAString(String str){

        char[] characters = str.toCharArray();
        HashMap<Character, Integer> charCountMap = new HashMap<>();

       for(char c:characters){
            int count =0;
             if(c == ' ') continue; 
            for(char i:characters){
                if(c==i)
                    count++;
            }
            charCountMap.put(c, count);
        }
        System.out.println(charCountMap);


    }

    public static void countEachCharacterInAString(String str){

        char[] characters = str.toCharArray();
        int count =0;

        for(int i =0;i<characters.length;i++){

            // if(characters[i]!=' ')
            // count++;

            if(Character.isAlphabetic(characters[i]))
                count++;

                // if(Character.isLetterOrDigit(characters[i]))
                //     count++;
        }
        System.out.println("Total characters in the string: " + count);

    }

}
