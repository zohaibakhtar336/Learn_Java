import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their grades
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Add students and their grades to the map
        studentGrades.put("Rahul", 85);       // Rahul's grade is 85
        studentGrades.put("Aditi", 90);       // Aditi's grade is 90
        studentGrades.put("Raj", 75);         // Raj's grade is 75
        studentGrades.put("Simran", 95);      // Simran's grade is 95

        // Print the HashMap
        System.out.println("Student Grades: " + studentGrades);

        // Get the grade of Rahul
        int rahulGrade = studentGrades.get("Rahul");
        System.out.println("Rahul's Grade: " + rahulGrade);  // Output: 85

        // Check if Aditi is in the map
        boolean hasAditi = studentGrades.containsKey("Aditi");
        System.out.println("Contains Aditi? " + hasAditi);  // Output: true

        // Check if grade 90 exists in the map
        boolean hasGrade90 = studentGrades.containsValue(90);
        System.out.println("Contains grade 90? " + hasGrade90);  // Output: true

        // Remove Raj from the map
        studentGrades.remove("Raj");
        System.out.println("After removing Raj: " + studentGrades);

        // Iterate through all entries in the map
        System.out.println("Iterating over entries:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Iterate through all keys in the map
        System.out.println("Iterating over keys:");
        for (String key : studentGrades.keySet()) {
            System.out.println("Key: " + key);
        }

        // Iterate through all values in the map
        System.out.println("Iterating over values:");
        for (Integer value : studentGrades.values()) {
            System.out.println("Value: " + value);
        }

        // Check the size of the map
        System.out.println("Size of HashMap: " + studentGrades.size());  // Output: 3 (after removing Raj)

        // Clear all entries from the map
        studentGrades.clear();
        System.out.println("After clearing HashMap: " + studentGrades);  // Output: {}
    }
}
