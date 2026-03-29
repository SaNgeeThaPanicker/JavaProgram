package Practise;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        System.out.println(map);

        map.remove("Alice");
        System.out.println(map);

        for(Map.Entry<String, Integer> e:map.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }

    }

}
