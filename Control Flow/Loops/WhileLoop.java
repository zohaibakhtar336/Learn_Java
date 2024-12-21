// A while loop is used to execute a block of code repeatedly as long as the condition is true.
// It checks the condition before executing the block of code inside the loop.
// Syntax:
// while (condition) {
//     // Code to be executed
// }

public class WhileLoop {

    public static void main(String args[]) {

        // Example: Print numbers from 1 to 5 using a while loop
        int count = 1;  // Initialize the counter variable

        // The while loop continues as long as 'i' is less than or equal to 5
        while (count <= 5) {
            // Inside the loop: printing the value of i
            System.out.println("The count is: " + count);
            count++;
        }

        // Output of this program will be:
        // 1
        // 2
        // 3
        // 4
        // 5
    }
}
