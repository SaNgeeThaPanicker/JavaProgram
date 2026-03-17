public class DuplicateCharacterInString {
    public static void main(String[] args) {
        String name = "Java Programming";
        char nameSplit[] = name.toCharArray();

        for (int i = 0; i < nameSplit.length; i++) {
            int count=0;
            for(int j=i+1;j<nameSplit.length;j++)
            {
                if(nameSplit[i]==nameSplit[j])
                {
                    count++;
                }
            }
            // print only first occurrence of duplicate
            if (count > 0 && name.indexOf(name.charAt(i)) == i) {
                System.out.println(name.charAt(i) + " → " + count + " times");
            }
        }
    }
    
}
