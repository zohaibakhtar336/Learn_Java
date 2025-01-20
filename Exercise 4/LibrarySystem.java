abstract class Book {
    abstract void displayDetails();
}

class Fiction extends Book {
    void displayDetails() {
        System.out.println("This is a fiction book.");
    }
}

class NonFiction extends Book {
    void displayDetails() {
        System.out.println("This is a non-fiction book.");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Fiction();
        book1.displayDetails();

        Book book2 = new NonFiction();
        book2.displayDetails();
    }
}
