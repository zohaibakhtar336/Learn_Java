// **Method Overloading in Java**
// - Method overloading allows a class to have multiple methods with the same name but different parameter lists.
// - It provides compile-time polymorphism (static binding).
// - Overloading is achieved by changing:
//   1. The number of parameters.
//   2. The type of parameters.
//   3. The order of parameters (if types differ).

// **Key Points:**
// - The return type can be different, but it alone cannot be used to distinguish overloaded methods.
// - Overloading cannot be achieved by changing only the method's name casing (Java is case-sensitive).
// - Overloaded methods can have different access modifiers, but that is not required for overloading.

// **Method Overloading in Java**
// - Method overloading allows a class to have multiple methods with the same name but different parameter lists.
// - It provides compile-time polymorphism (static binding).
// - Overloading is achieved by changing:
//   1. The number of parameters.
//   2. The type of parameters.
//   3. The order of parameters (if types differ).

// **Key Points:**
// - The return type can be different, but it alone cannot be used to distinguish overloaded methods.
// - Overloading cannot be achieved by changing only the method's name casing (Java is case-sensitive).
// - Overloaded methods can have different access modifiers, but that is not required for overloading.

// Example: Demonstrating method overloading.
public class MethodOverloadingExample {

    // Method 1: Add two integers
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers (different number of parameters)
    public int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double values (different parameter types)
    public double addNumbers(double a, double b) {
        return a + b;
    }

    // Method 4: Add an integer and a double (different order/types of parameters)
    public double addNumbers(int a, double b) {
        return a + b;
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        // Creating an instance of the MethodOverloadingExample class
        MethodOverloadingExample example = new MethodOverloadingExample();

        // Using different overloaded methods and printing the results
        System.out.println("Sum of 5 and 10: " + example.addNumbers(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + example.addNumbers(5, 10, 15));
        System.out.println("Sum of 5.5 and 10.5: " + example.addNumbers(5.5, 10.5));
        System.out.println("Sum of 5 and 10.5: " + example.addNumbers(5, 10.5));
    }
}
