// Control statements are used to control the flow of execution in a program.
// Java provides three main types of control statements:
// 1. Decision-Making Statements (if, if-else, switch)
// 2. Looping Statements (for, while, do-while)
// 3. Jump Statements (break, continue, return)

public class IfElseExample {
    public static void main(String args[]) {
        int num = 10;
        // Check if the number is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is even."); // Output if the number is divisible by 2
        } else {
            System.out.println(num + " is odd."); // Output if the number is not divisible by 2
        }
    }
}
