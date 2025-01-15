import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        
        map.put(1, "Amit");
        map.put(2, "Ravi");
        map.put(3, "Priya");
        map.put(4, "Shivani");

        System.out.println("LinkedHashMap (Insertion Order): " + map);

        System.out.println("Value for key 3: " + map.get(3));

        map.remove(2);
        System.out.println("After removing key 2: " + map);

        System.out.println("Contains key 1: " + map.containsKey(1));
        System.out.println("Contains value 'Shivani': " + map.containsValue("Shivani"));

        System.out.println("\nIterating through the LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        LinkedHashMap<Integer, String> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        
        accessOrderMap.put(1, "Ankit");
        accessOrderMap.put(2, "Neha");
        accessOrderMap.put(3, "Vikas");

        System.out.println("\nAccessing key 2: " + accessOrderMap.get(2));

        System.out.println("LinkedHashMap (Access Order after accessing key 2): " + accessOrderMap);

        accessOrderMap.get(3);
        System.out.println("LinkedHashMap (Access Order after accessing key 3): " + accessOrderMap);
    }
}
