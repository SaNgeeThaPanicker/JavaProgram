import java.util.ArrayList;

public class SwapString {
    public static void main(String[] args) {
        String name = "John Doe";

        //Using Array
        // String[] updated_name = name.split(" ");
        // String[] temp = new String[updated_name.length];

        // for (int i = updated_name.length - 1; i >= 0; i--) {
        //     temp[i] = updated_name[i];

        //     System.out.println(updated_name[i]);
        // }

        //Using ArrayList
        String[] updated_name2 = name.split(" ");
        ArrayList<String> temp2 = new ArrayList<>();
        for (int i = updated_name2.length - 1; i >= 0; i--) {
            temp2.add(updated_name2[i]);
        }
        System.out.println(temp2);
    }
}

