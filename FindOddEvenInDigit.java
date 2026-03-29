public class FindOddEvenInDigit {

    public static void main(String[] args) {
        int number = 1234567890;
        char[] digits = Integer.toString(number).toCharArray();

        for(char i:digits){
            if(Character.getNumericValue(i) % 2 == 0){
                System.out.println(i + " is an even digit.");
            } else {
                System.out.println(i + " is an odd digit.");
            }
        }
    }

}
