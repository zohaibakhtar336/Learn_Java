import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        // Add elements to the LinkedHashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");

        // Add a duplicate element (will not be added)
        set.add("Apple");

        // Elements will be printed in insertion order
        System.out.println(set);  // Output: Apple, Banana, Orange, Mango

        // Check if an element exists
        System.out.println(set.contains("Banana"));  // true

        // Remove an element
        set.remove("Orange");
        System.out.println(set);  // Output: Apple, Banana, Mango

        // Iterate through the set
        for (String fruit : set) {
            System.out.println(fruit);  // Output: Apple, Banana, Mango
        }
    }
}
