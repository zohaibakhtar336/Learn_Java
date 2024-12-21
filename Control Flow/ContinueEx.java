/* 
 * In Java, the `continue` statement is used to skip the current iteration of a loop 
 * and proceed with the next iteration. It can be used in `for`, `while`, and `do-while` 
 * loops. When `continue` is encountered, the remaining code in the current loop 
 * iteration is skipped, and the loop proceeds to the next iteration.
 * 
 * The `continue` statement can also be used with a condition to skip certain iterations.
 * For example, in a `for` loop, you might want to skip processing even numbers, 
 * but process odd numbers. This can be done using `continue` inside the loop.
 * 
 * Example: Let's write a program that prints all odd numbers from 1 to 10 using `continue`.
 */

 public class ContinueEx {
    public static void main(String args[]) {
        // Loop through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // If the number is even, skip this iteration and continue with the next number
            if (i % 2 == 0) {
                continue;  // Skip the even numbers
            }
            // Print the odd numbers
            System.out.println(i);
        }
    }
}
