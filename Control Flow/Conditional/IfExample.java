// The 'if' statement is a control flow statement used to execute a block of code 
// only if a specified condition evaluates to true. 
// If the condition evaluates to false, the code block inside the 'if' statement is skipped.

// Syntax:
// if (condition) {
//     // Code to execute if the condition is true
// }

public class IfExample {
    public static void main(String args[]) {
        // Define a variable
        int number = 10;

        // Check if the number is positive using an 'if' statement
        if (number > 0) {
            // This block will execute if the condition 'number > 0' is true
            System.out.println("The number is positive.");
        }

        // Additional message outside the 'if' statement
        System.out.println("Program ended.");
    }
}
