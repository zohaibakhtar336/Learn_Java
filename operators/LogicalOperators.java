// Logical AND (&&):
// The AND operator returns true if both operands are true.
// Example: true && true = true, false && true = false, false && false = false.
// It is used when you want both conditions to be true for an action to occur.

// Logical OR (||):
// The OR operator returns true if at least one operand is true.
// Example: true || false = true, false || false = false, true || true = true.
// It is used when you want either of the conditions to be true for an action to occur.

// Logical NOT (!):
// The NOT operator inverts the value of the boolean operand.
// Example: !true = false, !false = true.
// It is used when you want to reverse the boolean value of a condition.

// Usage in real-life conditions:
// Logical operators are used in decision-making situations (e.g., "if" statements),
// where we want to check multiple conditions at once.

public class LogicalOperators {
    public static void main(String[] args) {

        // Logical AND (&&) Example:
        // The AND operator returns true if both conditions are true.

        boolean isAdult = true; // Person is an adult
        boolean hasTicket = true; // Person has a ticket

        if (isAdult && hasTicket) {
            // This block will execute because both conditions are true
            System.out.println("You are allowed to enter.");
        } else {
            System.out.println("You cannot enter.");
        }

        // Logical OR (||) Example:
        // The OR operator returns true if at least one condition is true.

        boolean hasInvitation = false; // Person does not have an invitation
        boolean hasTicket2 = true; // Person has a ticket

        if (hasInvitation || hasTicket2) {
            // This block will execute because at least one condition is true
            System.out.println("You can attend the event.");
        } else {
            System.out.println("You cannot attend the event.");
        }

        // Logical NOT (!) Example:
        // The NOT operator reverses the boolean value.

        boolean isRainy = false; // It is not rainy

        if (!isRainy) {
            // This block will execute because !isRainy is true (since isRainy is false)
            System.out.println("You can go outside!");
        } else {
            System.out.println("Better stay inside.");
        }
    }
}
