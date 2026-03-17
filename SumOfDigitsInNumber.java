public class SumOfDigitsInNumber {
    public static void main(String []args)
    {
        int num =12345;
        int sum =0;

        while(num!=0){
            //Extract the last digit and add it to sum
            sum=sum+num%10;
            //Remove the last digit from num
            num=num/10;
        }
        System.out.println("Sum of digits: "+sum);
    }
    
}
