import java.util.HashSet;

public class DuplicatOccurenceOfWords {
    public static void main(String[] args) {

        //Simple way to find duplicate words in a string
        System.out.println("Simple way to find duplicate words in a string: ");
        String sentence = "Java is a programming java language. Java is widely used.";
        String cleanedSentence = sentence.toLowerCase();
        String[] words = cleanedSentence.split(" ");
    
        for(int i=0;i<words.length;i++){
            int count=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j]))
                {
                    count++;
                }
            }
            if(count>1 && cleanedSentence.indexOf(words[i])==i){
                System.out.println(words[i] + " appears " + count + " times");
            }
        }

        // Using HashSet to find duplicate words
        System.out.println("Using HashSet to find duplicate words: ");
        HashSet<String> seen = new HashSet<>();
        String[] wordsArray = sentence.toLowerCase().split(" ");

        for(String word: wordsArray){
            if(seen.contains(word)){
                continue;
            }
            else{
                int count=0;
                for(String w: wordsArray){
                    if(word.equals(w)){
                        count++;
                    }
                }
                if(count>1){
                    System.out.println(word + " appears " + count + " times");
                }
                seen.add(word);
            }
        }
    
    }

}
