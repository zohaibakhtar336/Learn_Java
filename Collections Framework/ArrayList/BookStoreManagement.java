import java.util.*;

public class BookStoreManagement {

    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();

        books.add("The Great Gatsby");
        books.add("To Kill a Mockingbird");
        books.add("1984");
        books.add("Moby Dick");

        System.out.println("All books: " + books);

        books.remove("1984");
        System.out.println("After removing '1984': " + books);

        String searchTitle = "Moby Dick";
        if (books.contains(searchTitle)) {
            System.out.println("Search for '" + searchTitle + "': Available");
        } else {
            System.out.println("Search for '" + searchTitle + "': Not Available");
        }

        System.out.println("Total Number of Books: " + books.size());

        String checkTitle = "The Great Gatsby";
        System.out.println("Is '" + checkTitle + "' in the list? " + books.contains(checkTitle));

        books.clear();
        System.out.println("All books after clearing: " + books);
    }
}
