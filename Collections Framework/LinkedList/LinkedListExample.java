import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        
        // Creating a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        System.out.println("Initial LinkedList: " + fruits);

        // Adding elements at specific positions
        fruits.addFirst("Grapes");  // Adds at the beginning
        fruits.addLast("Orange");   // Adds at the end
        fruits.add(2, "Pineapple"); // Adds at index 2

        System.out.println("After adding elements: " + fruits);

        // Accessing elements
        System.out.println("First Element: " + fruits.getFirst());  // Get first element
        System.out.println("Last Element: " + fruits.getLast());    // Get last element
        System.out.println("Element at index 2: " + fruits.get(2)); // Get element by index

        // Removing elements
        fruits.removeFirst();        // Remove first element
        fruits.removeLast();         // Remove last element
        fruits.remove("Banana");     // Remove specific element

        System.out.println("After removing elements: " + fruits);

        // Checking if an element exists
        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the list.");
        } else {
            System.out.println("Mango is not in the list.");
        }

        // Iterating using a for-each loop
        System.out.println("Using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterating using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clearing the LinkedList
        fruits.clear(); // Remove all elements
        System.out.println("LinkedList after clear: " + fruits);
    }
}
