// This program demonstrates the use of an if-else if statement in Java.
// An if-else if statement is used when you want to check multiple conditions.
// - The `if` block executes if its condition is true.
// - If the `if` condition is false, the program checks the `else if` conditions (if any).
// - If none of the `if` or `else if` conditions are true, the `else` block executes (if present).

public class IfElseIfExample {
    public static void main(String args[]) {
        int marks = 75; // Example input: marks obtained by a student

        // Checking the grade based on marks using if-else if statement
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
