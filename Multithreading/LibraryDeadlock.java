
class Book {

    synchronized void borrow(Book b) {
        System.out.println(Thread.currentThread().getName() + " borrowed " + this);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        b.returnBook();
    }

    synchronized void returnBook() {
        System.out.println(Thread.currentThread().getName() + " returned " + this);
    }
}

class Person extends Thread {

    Book book1, book2;

    Person(Book book1, Book book2) {
        this.book1 = book1;
        this.book2 = book2;
    }

    public void run() {
        book1.borrow(book2);  // Try to borrow book1 first, then book2
    }
}

public class LibraryDeadlock {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        Person p1 = new Person(book1, book2);  // Person 1 wants to borrow book1 and book2
        Person p2 = new Person(book2, book1);  // Person 2 wants to borrow book2 and book1

        p1.start();
        p2.start();
    }
}
