import java.util.*;

public class GenericsComparison {
    public static void main(String[] args) {
        // Without Generics: Raw type (Object)
        System.out.println("---- Without Generics ----");
        List rawList = new ArrayList(); // Raw List (any type allowed)
        
        // Adding different types
        rawList.add(10);       // Integer
        rawList.add("Hello");  // String
        rawList.add(3.14);     // Double

        // Retrieving with casting (unsafe)
        Integer intVal = (Integer) rawList.get(0);  // Cast required
        String strVal = (String) rawList.get(1);    // Cast required
        Double dblVal = (Double) rawList.get(2);    // Cast required

        // Display values
        System.out.println("Integer Value: " + intVal);
        System.out.println("String Value: " + strVal);
        System.out.println("Double Value: " + dblVal);
        
        // With Generics: Type-safe List
        System.out.println("\n---- With Generics ----");
        
        // Defining types for the list
        List<Integer> intList = new ArrayList<>();  // Only Integer
        List<String> strList = new ArrayList<>();   // Only String
        List<Double> dblList = new ArrayList<>();   // Only Double

        // Adding correct types
        intList.add(10);      // Integer
        strList.add("Hello"); // String
        dblList.add(3.14);    // Double

        // Retrieving without casting (safe)
        Integer intGenVal = intList.get(0);  // No cast
        String strGenVal = strList.get(0);   // No cast
        Double dblGenVal = dblList.get(0);   // No cast

        // Display values
        System.out.println("Integer Value: " + intGenVal);
        System.out.println("String Value: " + strGenVal);
        System.out.println("Double Value: " + dblGenVal);
    }
}
