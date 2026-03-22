import java.util.HashSet;

public class CountNumberOfWordsInAString {
    public static void main(String[] args) {
        String sentence = "Java is a programming language. Java is widely used.";
        String cleanedSentence = sentence.toLowerCase();
        String[] words = cleanedSentence.split(" ");
        int wordCount = words.length;
        System.out.println("Number of words in the string: " + wordCount);


        HashSet<String> uniqueWords = new HashSet<>();
        for(String w: words){
            uniqueWords.add(w);
        }
        System.out.println("Number of unique words in the string: " + uniqueWords.size());
    }

}
