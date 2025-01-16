import java.util.*;

public class LibrarySystem {
    public static void main(String[] args) {
        TreeMap<String, String> libraryCatalog = new TreeMap<>();

        libraryCatalog.put("978-0-12", "OS");
        libraryCatalog.put("978-0-13", "DBMS");
        libraryCatalog.put("978-0-14", "DAA");
        libraryCatalog.put("978-0-15", "COA");
        libraryCatalog.put("978-0-16", "Java");
        libraryCatalog.put("978-0-17", "Python");

        System.out.println("Library Catalog: " + libraryCatalog);

        String firstBook = libraryCatalog.firstEntry().getValue();
        String lastBook = libraryCatalog.lastEntry().getValue();
        System.out.println("First Book: " + firstBook);
        System.out.println("Last Book: " + lastBook);

        String isbnToCheck = "978-0-14";
        if (libraryCatalog.containsKey(isbnToCheck)) {
            System.out.println("Book with ISBN " + isbnToCheck + " is available: " + libraryCatalog.get(isbnToCheck));
        }

        libraryCatalog.remove("978-0-17");
        System.out.println("Updated Library Catalog after removing a book: " + libraryCatalog);
    }
}
