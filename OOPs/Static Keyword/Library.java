public class Library {
    
    static int totalBooks = 0;
    
    // Instance variables for each book
    String title;
    String author;
    double price;

    // Constructor to initialize book details
    public Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooks++;  // Incrementing the static counter
    }

    // Instance method to display book details
    public void displayBookDetails() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }

    // Static method to show total number of books in the library
    public static void showTotalBooks() {
        System.out.println("Total Books in Library: " + totalBooks);
    }

    public static void main(String[] args) {
        // Creating books (objects of Library class)
        Library book1 = new Library("Java Programming", "Herbert Schildt", 50.99);
        Library book2 = new Library("Database Management Systems (DBMS)", "Ramez Elmasri", 45.99);
        Library book3 = new Library("Operating Systems (OS)", "Silberschatz", 60.99);

        // Displaying book details
        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();

        // Showing the total number of books (static method)
        Library.showTotalBooks();
    }
}
