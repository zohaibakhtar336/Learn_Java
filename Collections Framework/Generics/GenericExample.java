public class GenericExample {
    // A simple Generic Method
    public static <T> void printItem(T item) {
        System.out.println("Item: " + item);
    }

    public static void main(String[] args) {
        // Calling the generic method with different types
        GenericExample.printItem("Welcome to Java!");
        GenericExample.printItem(42);
        GenericExample.printItem(3.14);
    }
}
