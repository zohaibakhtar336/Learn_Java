import java.util.*;

class Book {
    int id;
    String title;
    String author;
    boolean isAvailable;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available.");
        }
    }

    void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully!");
    }

    void displayDetails() {
        System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author + " | Available: " + isAvailable);
    }
}

class Member {
    int memberId;
    String name;
    int age;
    List<Book> borrowedBooks;

    Member(int memberId, String name, int age) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        borrowedBooks = new ArrayList<>();
    }

    void borrowBook(Book book) {
        if (book.isAvailable) {
            borrowedBooks.add(book);
            book.borrowBook();
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
        } else {
            System.out.println("This book was not borrowed by this member.");
        }
    }

    void displayDetails() {
        System.out.println("ID: " + memberId + " | Name: " + name + " | Age: " + age);
    }
}

class Library {
    List<Book> books;
    List<Member> members;

    Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    void addBook(int id, String title, String author) {
        books.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    void addMember(int memberId, String name, int age) {
        members.add(new Member(memberId, name, age));
        System.out.println("Member added successfully!");
    }

    void displayBooks() {
        for (Book book : books) {
            book.displayDetails();
        }
    }

    void displayMembers() {
        for (Member member : members) {
            member.displayDetails();
        }
    }

    Book searchBook(int id) {
        for (Book book : books) {
            if (book.id == id) {
                return book;
            }
        }
        System.out.println("Book not found.");
        return null;
    }

    Member searchMember(int memberId) {
        for (Member member : members) {
            if (member.memberId == memberId) {
                return member;
            }
        }
        System.out.println("Member not found.");
        return null;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Display Members");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter book author: ");
                    String author = sc.nextLine();
                    library.addBook(bookId, title, author);
                    break;

                case 2:
                    System.out.print("Enter member ID: ");
                    int memberId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter member name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter member age: ");
                    int age = sc.nextInt();
                    library.addMember(memberId, name, age);
                    break;

                case 3:
                    System.out.print("Enter member ID: ");
                    int mId = sc.nextInt();
                    Member member = library.searchMember(mId);
                    if (member != null) {
                        System.out.print("Enter book ID to borrow: ");
                        int bId = sc.nextInt();
                        Book book = library.searchBook(bId);
                        if (book != null) {
                            member.borrowBook(book);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter member ID: ");
                    int memId = sc.nextInt();
                    Member mem = library.searchMember(memId);
                    if (mem != null) {
                        System.out.print("Enter book ID to return: ");
                        int bkId = sc.nextInt();
                        Book bk = library.searchBook(bkId);
                        if (bk != null) {
                            mem.returnBook(bk);
                        }
                    }
                    break;

                case 5:
                    library.displayBooks();
                    break;

                case 6:
                    library.displayMembers();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
