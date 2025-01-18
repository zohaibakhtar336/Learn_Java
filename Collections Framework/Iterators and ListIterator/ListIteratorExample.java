import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Chennai");

        ListIterator<String> listIterator = cities.listIterator();

        // Traverse the list in forward direction
        System.out.println("Using ListIterator for forward traversal:");
        while (listIterator.hasNext()) {
            // Get the next element
            String city = listIterator.next();
            System.out.println(city);

            // Change "Mumbai" to "Pune"
            if (city.equals("Mumbai")) {
                listIterator.set("Pune");
            }
        }

        // Traverse the list in backward direction
        System.out.println("\nUsing ListIterator for backward traversal:");
        while (listIterator.hasPrevious()) {
            // Get the previous element
            String city = listIterator.previous();
            System.out.println(city);

            // Add "Hyderabad" before "Chennai"
            if (city.equals("Chennai")) {
                listIterator.add("Hyderabad");
            }
        }

        // Print the final list of cities
        System.out.println("\nFinal List of Cities: " + cities);
    }
}
