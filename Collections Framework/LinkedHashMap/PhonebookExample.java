import java.util.*;

public class PhonebookExample {
    public static void main(String[] args) {
        // Create a phonebook with names and phone numbers
        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();
        
        // Add contacts
        phonebook.put("Amit", "9876543210");
        phonebook.put("Neha", "9123456789");
        phonebook.put("Ravi", "9988776655");
        phonebook.put("Priya", "9876123456");
        
        // Print phonebook
        System.out.println("Phonebook: " + phonebook);

        // Get Ravi's phone number
        System.out.println("Ravi's Phone: " + phonebook.get("Ravi"));
        
        // Check if Amit exists in the phonebook
        System.out.println("Has Amit? " + phonebook.containsKey("Amit"));
        
        // Remove Priya's contact
        phonebook.remove("Priya");
        System.out.println("After removing Priya: " + phonebook);

        // Iterate through the phonebook
        System.out.println("\nContacts in Phonebook:");
        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Create a phonebook with access order
        LinkedHashMap<String, String> accessOrderPhonebook = new LinkedHashMap<>(16, 0.75f, true);
        
        // Add contacts
        accessOrderPhonebook.put("Mohan", "8887776666");
        accessOrderPhonebook.put("Simran", "7776665555");
        accessOrderPhonebook.put("Ankit", "9998887777");

        // Access Simran to change the order
        System.out.println("\nSimran's Phone: " + accessOrderPhonebook.get("Simran"));
        System.out.println("Phonebook (After accessing Simran): " + accessOrderPhonebook);

        // Access Mohan to change the order
        accessOrderPhonebook.get("Mohan");
        System.out.println("Phonebook (After accessing Mohan): " + accessOrderPhonebook);
    }
}
