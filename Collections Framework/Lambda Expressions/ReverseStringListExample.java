import java.util.*;

public class ReverseStringListExample {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Java", "Lambda", "Expression", "Example"));
        Collections.reverse(words);
        System.out.println("Reversed words: " + words);
    }
}
