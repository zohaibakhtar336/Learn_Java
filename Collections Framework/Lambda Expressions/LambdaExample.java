// Functional interface
interface Add {
    int addNumbers(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda expression with two parameters
        Add addition = (a, b) -> a + b;
        
        // Calling the method
        System.out.println("Sum: " + addition.addNumbers(5, 3));
    }
}
