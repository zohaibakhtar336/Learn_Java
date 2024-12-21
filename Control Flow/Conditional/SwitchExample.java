// The switch statement in Java is a multi-way branch statement that provides an easy 
// way to execute different parts of code based on the value of a single expression.
// It is a cleaner and more structured alternative to a series of if-else-if statements.

// SYNTAX:
// switch(expression) {
//     case value1:
//         // Code to execute if expression == value1
//         break;  // Exits the switch block
//     case value2:
//         // Code to execute if expression == value2
//         break;
//     ...
//     default:
//         // Code to execute if no cases match
// }

// KEY POINTS:
// 1. The `expression` in the switch statement must evaluate to one of the following types:
//    - byte, short, char, int
//    - Wrapper classes (Byte, Short, Character, Integer)
//    - String (since Java 7)
//    - Enum types
// 2. The `case` values must be compile-time constants or literals.
//    You cannot use variables or expressions as case labels.
// 3. The `break` statement is crucial to stop the execution from falling through 
//    subsequent cases. If omitted, the code will continue to execute all the following cases.
// 4. The `default` block is optional but is highly recommended to handle unexpected values.
// 5. The `switch` is faster and more efficient than multiple if-else blocks in scenarios
//    where the variable is compared against many constant values.

public class SwitchExample {

    public static void main(String args[]) {
        // Declaring a variable to represent a day of the week
        int day = 5;

        // Switch statement begins
        switch (day) {
            case 1: // Case for Monday
                System.out.println("Monday");
                break; // Exits the switch block

            case 2: // Case for Tuesday
                System.out.println("Tuesday");
                break;

            case 3: // Case for Wednesday
                System.out.println("Wednesday");
                break;

            case 4: // Case for Thursday
                System.out.println("Thursday");
                break;

            case 5: // Case for Friday
                System.out.println("Friday");
                break;

            case 6: // Case for Saturday
                System.out.println("Saturday");
                break;

            case 7: // Case for Sunday
                System.out.println("Sunday");
                break;

            // Default block handles unexpected values
            default:
                System.out.println("Invalid day");
        }
    }
}
