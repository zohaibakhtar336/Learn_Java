// A 'for' loop is used to repeat a block of code a certain number of times.

// syntax
// for (initialization; condition; increment) {
//     // Code to execute
// }
// - Initialization: Starts the loop counter.
// - Condition: The loop runs as long as this is true.
// - Increment: Updates the counter after each loop.

// Example 1: Printing numbers from 1 to 5
// Example 2: Finding the sum of numbers from 1 to 10

// Program Part:

public class ForLoop {
    public static void main(String args[]) {
        
        // Example 1: Print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);  // Prints i
        }

        // Example 2: Find the sum of numbers from 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;  // Add i to sum
        }
        
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);
    }
}
