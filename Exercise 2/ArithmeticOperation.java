public class ArithmeticOperation {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        char operation = '+';

        if (operation == '+') {
            System.out.println("Addition: " + (a + b));
        } else if (operation == '-') {
            System.out.println("Subtraction: " + (a - b));
        } else if (operation == '*') {
            System.out.println("Multiplication: " + (a * b));
        } else if (operation == '/') {
            if (b != 0) {
                System.out.println("Division: " + (a / b));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else if (operation == '%') {
            if (b != 0) {
                System.out.println("Modulus: " + (a % b));
            } else {
                System.out.println("Modulus by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operation.");
        }
    }
}
