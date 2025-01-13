import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet to store integers
        HashSet<Integer> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add(10);  
        set.add(20);  
        set.add(30);  
        set.add(20);  // Duplicate, will be ignored
        set.add(40);  

        // Displaying the HashSet (No specific order)
        System.out.println("HashSet: " + set);

        // Checking if an element exists in the set
        if (set.contains(20)) {
            System.out.println("20 is present");
        }

        // Removing an element from the set
        set.remove(30);  
        System.out.println("After removing 30: " + set);

        // Checking if the set is empty
        if (set.isEmpty()) {
            System.out.println("Set is empty");
        } else {
            System.out.println("Set is not empty");
        }

        // Getting the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Clearing all elements from the set
        set.clear();  
        System.out.println("After clearing: " + set);
    }
}
