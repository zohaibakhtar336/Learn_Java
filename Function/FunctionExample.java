// Functions in Java
// ------------------
// A function (also called a method in Java) is a block of code that performs a specific task.
// It helps to break down large programs into smaller, reusable components.
// Functions allow you to avoid code duplication and improve readability and maintainability.

// **Syntax of a Function:**
// returnType functionName(parameters) {
//     // function body
//     // return statement (if returnType is not void)
// }

// **Key Components:**
// 1. returnType: The data type of the value the function returns. If the function does not return anything, use 'void'.
// 2. functionName: The name of the function. Should be meaningful and follow naming conventions.
// 3. parameters: Variables passed to the function as input. They are optional and can be multiple.
// 4. function body: The code that defines the functionality of the function.
// 5. return statement: Specifies the value to return (optional if the returnType is void).

// **Types of Functions:**
// 1. Predefined Functions: Provided by Java (e.g., Math.sqrt(), System.out.println()).
// 2. User-defined Functions: Created by the programmer to perform specific tasks.

public class FunctionExample {

    // User-defined function to add two numbers
    public static int addNumbers(int a, int b) { // Function header
        // Function body
        int sum = a + b; // Calculate the sum
        return sum;      // Return the result
    }

    // Main function to call the user-defined function
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Calling the addNumbers function and storing the result
        int result = addNumbers(x, y);

        // Printing the result
        System.out.println("The sum of " + x + " and " + y + " is: " + result);
    }
}
