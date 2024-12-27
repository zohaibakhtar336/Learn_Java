public class StringManipulation {
    public static void main(String[] args) {
        String message = "  Hello, Java Programming!  ";

        // 1. Get string length
        System.out.println("Length: " + message.length());

        // 2. Get character at index
        System.out.println("Char at index 1: " + message.charAt(1));

        // 3. Extract substring
        System.out.println("Substring: " + message.substring(7, 11));

        // 4. Convert to uppercase
        System.out.println("Uppercase: " + message.toUpperCase());

        // 5. Convert to lowercase
        System.out.println("Lowercase: " + message.toLowerCase());

        // 6. Trim spaces
        System.out.println("Trimmed: " + message.trim());

        // 7. Replace characters
        System.out.println("Replace 'a' with '*': " + message.replace('a', '*'));

        // 8. Replace substring
        System.out.println("Replace 'Java': " + message.replaceAll("Java", "Python"));

        // 9. Find index of substring
        System.out.println("Index of 'Java': " + message.indexOf("Java"));

        // 10. Find last index of character
        System.out.println("Last index of 'a': " + message.lastIndexOf("a"));

        // 11. Check if string contains substring
        System.out.println("Contains 'Programming': " + message.contains("Programming"));

        // 12. Check if starts with substring
        System.out.println("Starts with '  Hello': " + message.startsWith("  Hello"));

        // 13. Check if ends with substring
        System.out.println("Ends with '!': " + message.endsWith("!"));

        // 14. Split string into words
        String[] words = message.trim().split(" ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 15. Concatenate strings
        System.out.println("Concatenated: " + message.trim().concat(" Let's learn!"));
    }
}
