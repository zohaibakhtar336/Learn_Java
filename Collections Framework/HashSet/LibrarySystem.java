import java.util.*;

public class LibrarySystem {
    public static void main(String[] args) {
        HashSet<String> bookTitles = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        bookTitles.add("Operating System");
        bookTitles.add("DBMS");
        bookTitles.add("Java Programming");
        bookTitles.add("Discrete Mathematics");
        bookTitles.add("DBMS"); // Duplicate, will be ignored

        System.out.println("Books Available: " + bookTitles);

        System.out.print("Enter a book title to check: ");
        String checkBook = sc.nextLine();
        if (bookTitles.contains(checkBook)) {
            System.out.println(checkBook + " is already in the library.");
        } else {
            System.out.println(checkBook + " is not in the library.");
        }

        System.out.print("Enter a book title to remove: ");
        String removeBook = sc.nextLine();
        if (bookTitles.remove(removeBook)) {
            System.out.println(removeBook + " has been removed.");
        } else {
            System.out.println(removeBook + " was not found.");
        }

        System.out.println("Final List of Books: " + bookTitles);
        System.out.println("Total Books in Library: " + bookTitles.size());

        sc.close();
    }
}
