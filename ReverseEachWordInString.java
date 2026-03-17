public class ReverseEachWordInString {

public static void main(String[] args) {
    String name = "John Doe";
    String temp = "";
    String nameSplit[] = name.split(" ");        

    for (int i = 0; i < nameSplit.length; i++) {
        String word = nameSplit[i];
        String nstr = "";

        for (int j = word.length() - 1; j >= 0; j--) {  
            char c = word.charAt(j);
            nstr = nstr + c;                              
        }
        temp = temp + nstr + " ";                         
    }
    System.out.println(temp.trim());
}
}