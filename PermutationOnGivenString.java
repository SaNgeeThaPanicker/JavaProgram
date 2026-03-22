import java.util.ArrayList;


public class PermutationOnGivenString {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Permutations of the string: ");
        char [] c = str.toCharArray();
        ArrayList<String> permutations = new ArrayList<>();
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c.length; j++){
                for(int k = 0; k < c.length; k++){
                    if(i != j && j != k && i != k){
                        String perm = "" + c[i] + c[j] + c[k];
                        permutations.add(perm);
                    }
                }
            }
        }
        System.out.println(permutations);

        // Using substring and recursion
        String RecursiveString = "abc"; permute(RecursiveString, "");
         
    }
    static void permute(String str, String prefix) { 
        if (str.length() == 0) 
            { System.out.println(prefix); 
            } 
        else { 
            for (int i = 0; i < str.length(); i++) 
                { 
                    String rem = str.substring(0,i) + str.substring(i+1); 
                    permute(rem,prefix + str.charAt(i)); 
                } 
            }
    }

}
