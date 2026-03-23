public class UniqueElementsInString {
    public static void main(String[] args) {
        String str = "hello world";
        String uniqueChars = getUniqueCharacters(str);
        System.out.println("Unique characters in the string: " + uniqueChars);
    }

    private static String getUniqueCharacters(String str) {
        StringBuilder uniqueChars = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (uniqueChars.indexOf(String.valueOf(currentChar)) == -1) {
                uniqueChars.append(currentChar);
            }
        }
        return uniqueChars.toString();
    }

}
