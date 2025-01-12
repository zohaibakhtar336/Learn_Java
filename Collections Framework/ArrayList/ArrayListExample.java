import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList: " + list);

        // Add element at index 1
        list.add(1, "Orange");
        System.out.println("After adding Orange at index 1: " + list);

        // Get element at index 2
        System.out.println("Element at index 2: " + list.get(2));

        // Replace element at index 2
        list.set(2, "Grapes");
        System.out.println("After replacing element at index 2 with Grapes: " + list);

        // Remove element at index 3
        list.remove(3);
        System.out.println("After removing element at index 3: " + list);

        // Remove element by value
        list.remove("Banana");
        System.out.println("After removing 'Banana': " + list);

        // Check if list contains an element
        System.out.println("List contains 'Apple': " + list.contains("Apple"));
        System.out.println("List contains 'Banana': " + list.contains("Banana"));

        // Get size of list
        System.out.println("Size of ArrayList: " + list.size());

        // Check if list is empty
        System.out.println("Is the ArrayList empty? " + list.isEmpty());

        // Get index of first occurrence of "Grapes"
        System.out.println("Index of 'Grapes': " + list.indexOf("Grapes"));

        // Get last index of "Apple"
        list.add("Apple");
        System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple"));

        // Convert ArrayList to array
        String[] array = list.toArray(new String[0]);
        System.out.print("ArrayList to array: ");
        for (String item : array) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Clear all elements
        list.clear();
        System.out.println("After clearing, ArrayList: " + list);

        // Check if list is empty after clearing
        System.out.println("Is the ArrayList empty after clearing? " + list.isEmpty());
    }
}
