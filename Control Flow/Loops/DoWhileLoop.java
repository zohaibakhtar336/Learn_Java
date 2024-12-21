// The do-while loop is used when you want to execute a block of code 
// at least once, regardless of the condition. The condition is checked 
// after the execution of the code block, meaning that the loop will run 
// at least one time before checking whether to continue or not.

// Syntax of do-while loop:
// do {
//     // code to be executed
// } while (condition);

public class DoWhileLoop {

    public static void main(String args[]) {

        int count = 1; // Initializing a counter variable

        // do-while loop starts here
        do {
            // This block of code will execute at least once
            System.out.println("The count is: " + count);
            count++; // Increment the count
        } while (count <= 5); // Loop will run as long as the condition is true

        // After count exceeds 5, the loop will stop.
    }
}
