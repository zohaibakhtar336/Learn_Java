public class StaticMethodExample {
    // Static method
    static void printMessage() {
        System.out.println("Static method called!");
    }

    public static void main(String[] args) {
        // Calling static method without creating an object
        StaticMethodExample.printMessage();
    }
}
