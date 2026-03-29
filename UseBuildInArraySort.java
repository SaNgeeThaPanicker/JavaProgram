import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UseBuildInArraySort {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};
        System.out.println("Original array:" );
        for (int num:array){
            System.out.print(num+" ");
        }
        System.out.println();

        Arrays.sort(array);
        System.out.println("Sorted array:");
        for (int num:array){
            System.out.print(num+" ");
        }

        ArrayList<Integer> listOfArrays = new ArrayList<>();
        listOfArrays.add(5);
        listOfArrays.add(2);        
        listOfArrays.add(8);
        listOfArrays.add(1);
        listOfArrays.add(3);
        System.out.println("\nOriginal ArrayList:" + listOfArrays);
        Collections.sort(listOfArrays);
        System.out.println("Sorted ArrayList:" + listOfArrays);

    }

}
