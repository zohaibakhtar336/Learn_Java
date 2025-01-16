import java.util.Hashtable;

public class Phonebook {

    public static void main(String[] args) {
        Hashtable<String, String> phonebook = new Hashtable<>();

        phonebook.put("Ayesha", "9876543210");
        phonebook.put("Rahul", "9988776655");
        phonebook.put("Imran", "9123456789");
        phonebook.put("Zohra", "9678901234");
        phonebook.put("Arshad", "9081726354");
        phonebook.put("Zohaib", "9988112233");

        System.out.println("Phonebook: " + phonebook);

        String ayeshaPhone = phonebook.get("Ayesha");
        System.out.println("Ayesha's phone number: " + ayeshaPhone);

        if (phonebook.containsKey("Imran")) {
            System.out.println("Imran's contact is present in the phonebook.");
        }

        if (phonebook.containsValue("9988112233")) {
            System.out.println("A contact with the phone number 9988112233 exists.");
        }

        phonebook.remove("Zohra");
        System.out.println("Phonebook after removal: " + phonebook);

        System.out.println("Size of the phonebook: " + phonebook.size());
    }
}
