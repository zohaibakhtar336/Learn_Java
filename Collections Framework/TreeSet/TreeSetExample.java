import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of Integer type
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(10);  // 10 will be added
        numbers.add(20);  // 20 will be added
        numbers.add(30);  // 30 will be added
        numbers.add(15);  // 15 will be added

        // Attempt to add a duplicate element
        numbers.add(10);  // 10 will not be added because it already exists in the TreeSet

        // Display the TreeSet (it will be sorted in ascending order)
        System.out.println("TreeSet elements: " + numbers);

        // Remove an element from the TreeSet
        numbers.remove(20);  // 20 will be removed

        // Display the updated TreeSet
        System.out.println("After removal of 20: " + numbers);

        // Check if an element is present in the TreeSet
        boolean contains10 = numbers.contains(10);  // True
        boolean contains20 = numbers.contains(20);  // False
        System.out.println("Contains 10: " + contains10);
        System.out.println("Contains 20: " + contains20);

        // Get the first and last elements of the TreeSet
        Integer first = numbers.first();  // Returns 10
        Integer last = numbers.last();    // Returns 30
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);

        // Poll the first and last elements (remove and return)
        Integer pollFirst = numbers.pollFirst();  // Removes 10
        Integer pollLast = numbers.pollLast();    // Removes 30
        System.out.println("Polled first: " + pollFirst);
        System.out.println("Polled last: " + pollLast);

        // Display the final TreeSet
        System.out.println("Final TreeSet: " + numbers);
    }
}
