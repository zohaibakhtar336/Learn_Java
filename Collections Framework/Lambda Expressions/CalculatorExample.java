import java.util.Scanner;

@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
}

public class CalculatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        Calculator add = (a, b) -> a + b;
        System.out.println("Addition result: " + add.calculate(num1, num2));
        
        Calculator subtract = (a, b) -> a - b;
        System.out.println("Subtraction result: " + subtract.calculate(num1, num2));
        
        Calculator multiply = (a, b) -> a * b;
        System.out.println("Multiplication result: " + multiply.calculate(num1, num2));
        
        Calculator divide = (a, b) -> a / b;
        System.out.println("Division result: " + divide.calculate(num1, num2));
        
        scanner.close();
    }
}
