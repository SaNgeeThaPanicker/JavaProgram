import java.util.ArrayList;

public class PrintFirstAndLastElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        System.out.println("First Element through index:" +list.get(0));
        System.out.println("First Element through getFirst():"+list.getFirst());
        System.out.println("Last Element through getLast():"+list.getLast());
        System.out.println("Last Element through index:"+list.get(list.size()-1));
    }

}
