// Assignment Operator in Java
// The assignment operator (=) is used to assign the value of a right-hand operand to the left-hand variable.
// It is one of the most commonly used operators in Java.

// Rules of Assignment Operator:
// 1. The left-hand side of the assignment operator must be a variable (it cannot be a constant or expression).
// 2. The right-hand side can be any expression or value that matches the type of the left-hand variable.
// 3. Java performs implicit type casting if the right-hand operand's data type can be safely converted to the left-hand variable's type.
// 4. The assignment operator returns the value assigned to the variable (this can be useful in chain assignments).

// Limitations of Assignment Operator:
// 1. The assignment operator cannot be used to perform operations like addition or multiplication. It only assigns a value.
// 2. The types on both sides must be compatible. For example, you cannot assign a string to an integer variable.
// 3. It cannot assign values to constants or literals (e.g., final variables).

public class AssignmentOperators {
    public static void main(String[] args) {

        // Example 1: Simple Assignment
        int a = 10; // Here, 'a' is assigned the value 10.

        // Example 2: Assignment with Arithmetic Operations
        int b = 5;
        int c = a + b; // The value of 'a' (10) and 'b' (5) is added, and the result (15) is assigned
                       // to 'c'.

        // Example 3: Chained Assignment
        int x, y, z;
        x = y = z = 50; // The value 50 is assigned to z, then y, and then x in a chained assignment.

        // Example 4: Assignment with Type Casting (Implicit)
        double d = 5.5;
        int i = (int) d; // Casting 'd' (double) to 'i' (int), which results in loss of precision (value
                         // 5).

        // Example 5: Invalid Assignment (Compilation Error)
        // int num = "Hello"; // This will cause an error because "Hello" is a String,
        // not an integer.

        // Printing the results of assignments
        System.out.println("a: " + a); // Output: a: 10
        System.out.println("b: " + b); // Output: b: 5
        System.out.println("c: " + c); // Output: c: 15
        System.out.println("x: " + x); // Output: x: 50
        System.out.println("y: " + y); // Output: y: 50
        System.out.println("z: " + z); // Output: z: 50
        System.out.println("i: " + i); // Output: i: 5 (due to the cast)
    }
}
