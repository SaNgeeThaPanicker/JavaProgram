import java.util.ArrayList;

public class Armstrong_CodingNinja {

    public static boolean isArmstrong(int num)
	{
        ArrayList<Integer> digits = new ArrayList<>();
        int temp = num;
        while(temp > 0){
            int s =temp % 10;
            digits.add(s);
            temp = temp / 10;
        }
        int sum = 0;
        for(int digit: digits){
            sum += Math.pow(digit, digits.size());
        }
        return sum == num;
	}

    public static void main(String[] args) {
        int num = 153;
        if(isArmstrong(num))
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
