import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ayesha");
        names.add("Rahul");
        names.add("Sneha");
        names.add("Arjun");

        Iterator<String> iterator = names.iterator();

        // Traverse the list using the iterator
        System.out.println("Using Iterator to traverse the list:");
        while (iterator.hasNext()) {
            // Get the next element
            String name = iterator.next();
            System.out.println(name);

            // Remove "Rahul" from the list
            if (name.equals("Rahul")) {
                iterator.remove();
            }
        }

        // Print the list after removal
        System.out.println("List after removal: " + names);
    }
}
