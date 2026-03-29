package Practise;
import java.util.HashSet;

public class HashSetPractice {

    public static void main(String[] args) {
        HashSet<String> names =new HashSet<>();
         names.add("Panicker");
        names.add("Sangeetha");
        names.add("Shreyash");
        names.add(null);
        names.add(null);
        names.add("Anand");
        System.out.println(names);

        names.remove("Panicker");
        System.out.println(names);

        for(String element: names){
            System.out.println(element);
        }

    }
}
