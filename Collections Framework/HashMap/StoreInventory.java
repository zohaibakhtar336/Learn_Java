import java.util.*;

public class StoreInventory {
    public static void main(String[] args) {
        HashMap<String, String> inventory = new HashMap<>();

        inventory.put("Laptop", "10, 50000");
        inventory.put("Smartphone", "25, 20000");
        inventory.put("Headphones", "50, 1500");
        inventory.put("Smartwatch", "15, 3000");

        System.out.println("Store Inventory: " + inventory);

        String smartphoneDetails = inventory.get("Smartphone");
        System.out.println("Smartphone Details (Quantity, Price): " + smartphoneDetails);

        boolean hasLaptop = inventory.containsKey("Laptop");
        System.out.println("Contains Laptop? " + hasLaptop);

        boolean hasItemWithPrice = inventory.containsValue("20000");
        System.out.println("Contains item with price 20000? " + hasItemWithPrice);

        inventory.remove("Headphones");
        System.out.println("After removing Headphones: " + inventory);

        System.out.println("Iterating over items:");
        for (Map.Entry<String, String> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Iterating over item names:");
        for (String item : inventory.keySet()) {
            System.out.println("Item: " + item);
        }

        System.out.println("Iterating over item details:");
        for (String details : inventory.values()) {
            System.out.println("Details: " + details);
        }

        System.out.println("Total number of items: " + inventory.size());

        inventory.clear();
        System.out.println("After clearing inventory: " + inventory);
    }
}
