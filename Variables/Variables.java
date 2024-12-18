// Variables in Java
// ------------------
// A variable is a container that holds data which can be changed during the execution of a program.

// 1. To declare a variable, you need to specify its data type and a name.
// 2. Java has different data types for storing different kinds of data, such as:
//    - int (for integers)
//    - double (for decimal numbers)
//    - char (for a single character)
//    - boolean (for true/false values)
//    - String (for text)

// Example: Let's see how to declare, assign, and use variables in Java.

public class Variables {
    public static void main(String[] args) {
        // Declaring an integer variable and assigning a value to it
        int age = 25; // age is a variable that stores the value 25

        // Declaring a double variable for storing a decimal number
        double price = 19.99; // price is a variable that stores the value 19.99

        // Declaring a character variable for storing a single character
        char grade = 'A'; // grade is a variable that stores the character 'A'

        // Declaring a boolean variable for storing true/false
        boolean isJavaFun = true; // isJavaFun is a variable that stores true

        // Declaring a String variable for storing text
        String name = "John"; // name is a variable that stores the text "John"

        // Printing the values of the variables
        System.out.println("Age: " + age); // Outputs: Age: 25
        System.out.println("Price: " + price); // Outputs: Price: 19.99
        System.out.println("Grade: " + grade); // Outputs: Grade: A
        System.out.println("Is Java fun? " + isJavaFun); // Outputs: Is Java fun? true
        System.out.println("Name: " + name); // Outputs: Name: John
    }
}
