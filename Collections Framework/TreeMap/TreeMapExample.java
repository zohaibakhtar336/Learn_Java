import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");

        // Display the TreeMap (automatically sorted by key)
        System.out.println("TreeMap: " + map);

        // Accessing value by key
        String value = map.get(2); 
        System.out.println("Value for key 2: " + value);

        // Remove a key-value pair
        map.remove(1); 
        System.out.println("TreeMap after removal: " + map);

        // Checking if a key exists
        if (map.containsKey(3)) {
            System.out.println("Key 3 is present in the TreeMap.");
        }

        // Display the first and last key
        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
    }
}
