// Data Types in Java
// A data type defines the type of data a variable can hold. In Java, data types are divided into two categories: 
// Primitive Data Types and Reference Data Types.

// 1. Primitive Data Types: These are the most basic data types and include:
//    - byte: 8-bit integer. Range: -128 to 127.
//    - short: 16-bit integer. Range: -32,768 to 32,767.
//    - int: 32-bit integer. Range: -2^31 to 2^31-1.
//    - long: 64-bit integer. Range: -2^63 to 2^63-1.
//    - float: 32-bit floating point. Used for decimal values with lower precision.
//    - double: 64-bit floating point. Used for decimal values with higher precision.
//    - char: 16-bit Unicode character. Range: 0 to 65535.
//    - boolean: Represents true or false values.

// 2. Reference Data Types: These are types that store references to objects. Examples include:
//    - Objects (like String, Arrays, etc.)

// Rules for Data Types:
// - A variable must be declared with a data type.
// - Data types cannot be changed after declaration. For example, an int cannot be assigned a String value.
// - Some data types can hold more complex structures, like classes, while primitive types store simple values.

// Limitations of Data Types:
// - The size of primitive data types is fixed (e.g., int always takes 4 bytes).
// - If a value exceeds the range of a data type, it can cause overflow or underflow.
// - Primitive types cannot store more complex structures like objects, which is where reference types come in.

// Example (simple):
// int age = 25; // int can store integer values
// double price = 19.99; // double is used for decimal values
// char grade = 'A'; // char stores single characters
// boolean isStudent = true; // boolean stores true or false values

// Class definition
public class DataTypes {
    public static void main(String args[]) {
        // Defining variables
        int num = 10; // int type variable, stores whole numbers
        double price = 19.99; // double type variable, stores decimal values
        boolean isJavaFun = true; // boolean type variable, stores true or false
        char grade = 'A'; // char type variable, stores a single character
        String message = "Hello, World!"; // String type, stores a sequence of characters (text)

        // Displaying the values of the variables
        System.out.println("Integer value: " + num); // Prints: Integer value: 10
        System.out.println("Double value: " + price); // Prints: Double value: 19.99
        System.out.println("Boolean value: " + isJavaFun); // Prints: Boolean value: true
        System.out.println("Char value: " + grade); // Prints: Char value: A
        System.out.println("String value: " + message); // Prints: String value: Hello, World!
    }
}
