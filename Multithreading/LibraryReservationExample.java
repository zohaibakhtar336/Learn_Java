class Library {
    private boolean bookAvailable = true;

    synchronized void reserveBook(String customer) {
        if (bookAvailable) {
            System.out.println(customer + " reserved the book.");
            bookAvailable = false;
        } else {
            System.out.println(customer + " tried to reserve the book, but it's already reserved.");
        }
    }
}

class Customer extends Thread {
    Library library;
    String name;

    Customer(Library library, String name) {
        this.library = library;
        this.name = name;
    }

    public void run() {
        library.reserveBook(name);
    }
}

public class LibraryReservationExample {
    public static void main(String[] args) {
        Library library = new Library();

        Customer c1 = new Customer(library, "Aaina");
        Customer c2 = new Customer(library, "Sara");

        c1.start();
        c2.start();
    }
}
