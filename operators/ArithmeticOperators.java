// **Arithmetic Operators in Java**

// Arithmetic operators are used to perform basic mathematical operations in Java.
// These include addition, subtraction, multiplication, division, and modulus.

// **1. Types of Arithmetic Operators:**
// - Addition (`+`): Adds two numbers.
//   Example: int sum = 10 + 5; // sum = 15
// - Subtraction (`-`): Subtracts one number from another.
//   Example: int diff = 10 - 5; // diff = 5
// - Multiplication (`*`): Multiplies two numbers.
//   Example: int prod = 10 * 5; // prod = 50
// - Division (`/`): Divides one number by another.
//   Example: int quot = 10 / 5; // quot = 2
// - Modulus (`%`): Finds the remainder of division.
//   Example: int rem = 10 % 3; // rem = 1

// **2. Important Points About Division:**
// - Division by zero is not allowed and causes an error.
// - Integer division gives only the whole number part of the result.
//   Example: int result = 7 / 2; // result = 3
// - To get a decimal result, use double or float data types.
//   Example: double result = 7.0 / 2.0; // result = 3.5

// **3. Operator Precedence:**
// - Multiplication (`*`), Division (`/`), and Modulus (`%`) are evaluated before Addition (`+`) and Subtraction (`-`).
// - Parentheses `()` can be used to control the order of operations.
//   Example: 
//     int result = 10 + 5 * 2;        // result = 20 (multiplication first)
//     int corrected = (10 + 5) * 2;  // corrected = 30 (parentheses first)

// **4. Example of Combined Operations:**
// - You can combine multiple arithmetic operators in one expression.
//   Example: int result = (10 + 5) * (10 - 5); // result = 75

// **Summary:**
// Arithmetic operators are simple to use and essential for calculations in Java.
// Understanding operator precedence helps avoid errors in complex expressions.


public class ArithmeticOperators {
    public static void main(String[] args) {
        // Let's start with two numbers
        int num1 = 10; // First number
        int num2 = 5; // Second number

        // Addition (+): Adds two numbers
        int add = num1 + num2;
        System.out.println("Addition: " + add); // Example output: 15

        // Subtraction (-): Subtracts one number from another
        int subtract = num1 - num2;
        System.out.println("Subtraction: " + subtract); // Example output: 5
        // Multiplication (*): Multiplies two numbers
        int multiply = num1 * num2;
        System.out.println("Multiplication: " + multiply); // Example output: 50

        // Division (/): Divides one number by another
        int divide = num1 / num2;
        System.out.println("Division: " + divide); // Example output: 2

        // Modulus (%): Finds the remainder when one number is divided by another
        int remainder = num1 % num2;
        System.out.println("Modulus: " + remainder); // Example output: 0
    }
}
