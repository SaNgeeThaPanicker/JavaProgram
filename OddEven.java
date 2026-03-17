import java.util.ArrayList;

public class OddEven{
    public static void main(String []args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)%2==0){
                System.out.println(numbers.get(i)+" is even");
            }
            else
            {
                System.out.println(numbers.get(i)+" is odd");
            }
        }
    }
}