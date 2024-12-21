/*
 * In Java, the `break` statement is used to terminate the execution of a loop or switch statement.
 * When `break` is encountered, the control of the program immediately exits the loop or switch, 
 * and the next statement after the loop or switch is executed.
 * 
 * The `break` statement is commonly used in the following scenarios:
 * 1. To exit a loop when a certain condition is met.
 * 2. To exit a `switch` statement.
 * 
 * Note:
 * - It only terminates the nearest enclosing loop or switch, not any outer loops.
 * 
 * In this example, the program demonstrates how `break` is used to exit a `for` loop when a specific condition is met.
 */

public class BreakEx {

    public static void main(String args[]) {
        // Loop to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // If the number is 5, exit the loop using break
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Loop exited.");
    }
}
