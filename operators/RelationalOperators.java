// Relational operators in Java are used to compare two values or expressions. 
// They return a boolean value (true or false) based on the result of the comparison.

// The relational operators in Java are:
// 1. ==   (Equal to) : Checks if two values are equal.
// 2. !=   (Not equal to) : Checks if two values are not equal.
// 3. >    (Greater than) : Checks if the left value is greater than the right value.
// 4. <    (Less than) : Checks if the left value is less than the right value.
// 5. >=   (Greater than or equal to) : Checks if the left value is greater than or equal to the right value.
// 6. <=   (Less than or equal to) : Checks if the left value is less than or equal to the right value.

// Example to demonstrate relational operators in Java:
public class RelationalOperators {
    public static void main(String[] args) {
        int num1 = 10; // First number
        int num2 = 20; // Second number

        // Using relational operators to compare num1 and num2

        // Equal to (==)
        System.out.println("num1 == num2: " + (num1 == num2)); // false because 10 is not equal to 20

        // Not equal to (!=)
        System.out.println("num1 != num2: " + (num1 != num2)); // true because 10 is not equal to 20

        // Greater than (>)
        System.out.println("num1 > num2: " + (num1 > num2)); // false because 10 is not greater than 20

        // Less than (<)
        System.out.println("num1 < num2: " + (num1 < num2)); // true because 10 is less than 20

        // Greater than or equal to (>=)
        System.out.println("num1 >= num2: " + (num1 >= num2)); // false because 10 is not greater than or equal to 20

        // Less than or equal to (<=)
        System.out.println("num1 <= num2: " + (num1 <= num2)); // true because 10 is less than or equal to 20
    }
}
