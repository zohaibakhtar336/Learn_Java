public class StaticNestedExample {

    // Static Nested Class
    static class NestedClass {
        void display() {
            System.out.println("Static Nested Class!");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of static nested class
        StaticNestedExample.NestedClass nestedObject = new StaticNestedExample.NestedClass();
        nestedObject.display();
    }
}
