public class BookConstruct {
    // Instance variables
    String title;
    String author;
    double price;

    // Constructor to initialize
    public BookConstruct(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }

    public static void main(String[] args) {
        // Creating a Book object and passing values to the constructor
        BookConstruct book1 = new BookConstruct("Java Programming", "John Doe", 499.99);

        // Calling the method to display book details
        book1.displayBookInfo();
    }
}
