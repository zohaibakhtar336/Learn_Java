// Concept of Ternary Operator:
// The ternary operator is a shorthand for an if-else statement.
// It has the following syntax:
// condition ? expression1 : expression2;
// If the condition is true, expression1 is executed; otherwise, expression2 is executed.

// Rules of Ternary Operator:
// 1. It must have three operands.
// 2. It must contain a condition that evaluates to a boolean value.
// 3. The ternary operator can be used to assign values or return results based on the condition.
// Limitations of Ternary Operator:
// 1. It should not be used for complex conditions as it can reduce code readability.
// 2. It can only handle two branches (if-else). It cannot be used for more complex branching.
// 3. The ternary operator can be nested, but it is not recommended for better code readability.

public class TernaryOperators {
    public static void main(String[] args) {

        // Example of using Ternary Operator:
        int number = 10;

        // Using Ternary Operator to check if a number is even or odd:
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + result);

        // Example of using Ternary Operator to assign value:
        int max = (number > 5) ? 100 : 50;
        System.out.println("Max value is: " + max);

        // Example of nesting ternary operators (not recommended for readability):
        String result2 = (number > 0)
                ? ((number % 2 == 0) ? "Positive Even" : "Positive Odd")
                : "Non-positive";
        System.out.println("The number is: " + result2);
    }
}
