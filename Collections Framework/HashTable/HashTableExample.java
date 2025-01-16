import java.util.*;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("Amit", "Delhi");
        hashtable.put("Priya", "Mumbai");
        hashtable.put("Anil", "Bangalore");
        hashtable.put("Rekha", "Chennai");

        System.out.println("Hashtable: " + hashtable);

        String city = hashtable.get("Amit");
        System.out.println("Amit lives in: " + city);

        if (hashtable.containsKey("Anil")) {
            System.out.println("Anil is present in the Hashtable.");
        }

        if (hashtable.containsValue("Mumbai")) {
            System.out.println("Mumbai is present in the Hashtable.");
        }

        hashtable.remove("Priya");
        System.out.println("Hashtable after removal: " + hashtable);

        System.out.println("Iterating through the Hashtable:");
        for (String key : hashtable.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }

        System.out.println("Size of the Hashtable: " + hashtable.size());
    }
}
