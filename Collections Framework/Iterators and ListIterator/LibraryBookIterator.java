import java.util.*;

public class LibraryBookIterator {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("DBMS");
        books.add("OS");
        books.add("DAA");
        books.add("Java");

        Iterator<String> iterator = books.iterator();

        System.out.println("Books available in the library:");
        while (iterator.hasNext()) {
            String book = iterator.next();
            System.out.println(book);

            if (book.equals("Java")) {
                iterator.remove();
                System.out.println("Removed damaged book: " + book);
            }
        }

        System.out.println("Updated book list: " + books);
    }
}
