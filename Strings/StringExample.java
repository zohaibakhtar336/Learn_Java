// Strings in Java:
// 1. A String is a sequence of characters enclosed in double quotes.
//    Example: String str = "Hello, World!";

// 2. Strings are immutable, meaning once created, they cannot be changed.

// 3. The `String` class provides various methods for string manipulation.

// 4. Common string operations:
//    - `length()`: Returns the length of the string.
//    - `charAt(index)`: Fetches the character at the given index (0-based).
//    - `substring(start, end)`: Extracts a substring from start to end (exclusive).
//    - `toUpperCase()`, `toLowerCase()`: Converts the string to uppercase or lowercase.
//    - `replace(oldChar, newChar)`: Replaces all occurrences of oldChar with newChar.
//    - `trim()`: Removes leading and trailing whitespace.
//    - `indexOf(char/substring)`: Finds the index of a character or substring.
//    - `concat()`: Appends one string to another.

public class StringExample {
    public static void main(String[] args) {
        // Create a string
        String message = "  Welcome to Java Programming!  ";
        
        // Fetch the length of the string
        System.out.println("Original Length: " + message.length());
        
        // Fetch a specific character
        System.out.println("First character: " + message.charAt(0));
        
        // Extract a substring
        System.out.println("Substring: " + message.substring(11, 15)); // Extracts "Java"
        
        // Convert to uppercase
        System.out.println("Uppercase: " + message.toUpperCase());
        
        // Convert to lowercase
        System.out.println("Lowercase: " + message.toLowerCase());
        
        // Replace a character
        String replacedMessage = message.replace(' ', '-');
        System.out.println("Replaced Spaces with '-': " + replacedMessage);
        
        // Remove leading and trailing spaces
        String trimmedMessage = message.trim();
        System.out.println("Trimmed Message: " + trimmedMessage);
        
        // Find the index of a substring
        System.out.println("Index of 'Java': " + message.indexOf("Java"));
        
        // Concatenate with another string
        String newMessage = trimmedMessage.concat(" Let's learn!");
        System.out.println("Concatenated Message: " + newMessage);
    }
}
