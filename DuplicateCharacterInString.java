import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterInString {
    public static void main(String[] args) {
        String name = "Java Programming";
        char[] characters = name.toCharArray();
        System.out.println("Duplicate characters in the string: ");
        for (int i = 0; i < characters.length; i++) {
            int count=1;
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    count++;
                }
            }
            if (count > 1 && name.indexOf(name.charAt(i)) == i) {
                System.out.print(characters[i] + " " + count + " times "+"\n");
            }
            }

        // Using HashSet to find duplicate characters
        System.out.println("Using HashSet to find duplicate characters: ");
        Set<Character> uniqueCharacters =new HashSet<>();

        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
            uniqueCharacters.add(c);
        }
        for(char c: uniqueCharacters){
            int count =0;
            for(int i=0;i<name.length();i++){
                if(c==name.charAt(i))
                {
                    count++;
                }
            }
            if(count > 1){
                System.out.println(c + " appears " + count + " times");
            }
        }

        // Using Hashmap to find duplicate characters
        System.out.println("Using HashMap to find duplicate characters: ");

        HashMap<Character, Integer> characterCountMap = new HashMap<>();
        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
            if (characterCountMap.containsKey(c)) {
                characterCountMap.put(c, characterCountMap.get(c) + 1);
            } else {
                characterCountMap.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry: characterCountMap.entrySet()){
            if(entry.getValue() >1)
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
        }
        }
    }