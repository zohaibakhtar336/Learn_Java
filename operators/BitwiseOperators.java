// Bitwise Operators are used to perform bit-level operations on data. These operators 
// manipulate individual bits of integer data types (like int, long, etc.) by performing 
// operations directly on the binary representation of numbers.

// Types of Bitwise Operators in Java:
// 1. AND (&) - Performs bitwise AND operation. Result is 1 if both bits are 1, otherwise 0.
// 2. OR (|) - Performs bitwise OR operation. Result is 1 if either of the bits is 1, otherwise 0.
// 3. XOR (^) - Performs bitwise XOR operation. Result is 1 if the bits are different, otherwise 0.
// 4. NOT (~) - Performs bitwise NOT operation. Inverts all the bits (0 becomes 1, and 1 becomes 0).
// 5. Left Shift (<<) - Shifts the bits to the left by a specified number of positions. Each shift left operation multiplies the number by 2.
// 6. Right Shift (>>) - Shifts the bits to the right by a specified number of positions. Each shift right operation divides the number by 2.
// 7. Unsigned Right Shift (>>>) - Similar to the right shift, but shifts zero bits into the leftmost positions.

// Rules of Bitwise Operators:
// 1. Bitwise operators only work with integer types (byte, short, int, long) in Java.
// 2. The result of a bitwise operation is an integer (int or long) depending on the operand types.
// 3. Bitwise operations are applied directly to the bits of the operands.
// 4. The NOT (~) operator only works on single operands, while other operators work with two operands.
// 5. Left and right shift operators work on integer types, and the number of shifts must be within the bit width of the operand (e.g., 32 for int, 64 for long).
// 6. When shifting bits, left shift can cause overflow, and right shift may cause data loss (for signed integers).

// Limitations of Bitwise Operators:
// 1. Bitwise operators only work on integer types (int, long, byte, short) and not on floating-point types (float, double).
// 2. Bitwise operations can only work with integral data types. They do not work with boolean data types or objects.
// 3. The left and right shift operators (<<, >>) cannot be used with negative shift values. Shift values should be non-negative integers.
// 4. The NOT (~) operator cannot be applied to objects, only primitive data types.
// 5. Overflow and underflow issues may occur when performing shifts that result in a value exceeding the data type's bit width (e.g., shifting 32-bit int by more than 31 positions).

public class BitwiseOperators {
    public static void main(String[] args) {

        // Example 1: Bitwise AND (&)
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011
        int result = a & b; // Result: 0001 (1 in decimal)
        System.out.println("Bitwise AND: " + result); // Output: 1

        // Example 2: Bitwise OR (|)
        a = 5; // Binary: 0101
        b = 3; // Binary: 0011
        result = a | b; // Result: 0111 (7 in decimal)
        System.out.println("Bitwise OR: " + result); // Output: 7

        // Example 3: Bitwise XOR (^)
        a = 5; // Binary: 0101
        b = 3; // Binary: 0011
        result = a ^ b; // Result: 0110 (6 in decimal)
        System.out.println("Bitwise XOR: " + result); // Output: 6

        // Example 4: Bitwise NOT (~)
        a = 5; // Binary: 0101
        result = ~a; // Result: 1010 (-6 in decimal)
        System.out.println("Bitwise NOT: " + result); // Output: -6

        // Example 5: Left Shift (<<)
        a = 5; // Binary: 0101
        result = a << 1; // Shifts left by 1 position. Result: 1010 (10 in decimal)
        System.out.println("Left Shift: " + result); // Output: 10

        // Example 6: Right Shift (>>)
        a = 5; // Binary: 0101
        result = a >> 1; // Shifts right by 1 position. Result: 0010 (2 in decimal)
        System.out.println("Right Shift: " + result); // Output: 2

        // Example 7: Unsigned Right Shift (>>>)
        a = -5; // Binary (2's complement): 11111111111111111111111111111011
        result = a >>> 1; // Shifts right by 1 position. Result: 01111111111111111111111111111101
                          // (2147483643)
        System.out.println("Unsigned Right Shift: " + result); // Output: 2147483643
    }
}
