import java.util.*;

public class ProductPriceList {
    public static void main(String[] args) {
        TreeMap<Integer, Double> productPrices = new TreeMap<>();

        productPrices.put(101, 299.99);
        productPrices.put(103, 399.50);
        productPrices.put(102, 150.75);
        productPrices.put(105, 249.99);

        System.out.println("Product Price List: " + productPrices);

        double cheapestProductPrice = productPrices.firstEntry().getValue();
        System.out.println("Cheapest Product Price: $" + cheapestProductPrice);

        double mostExpensiveProductPrice = productPrices.lastEntry().getValue();
        System.out.println("Most Expensive Product Price: $" + mostExpensiveProductPrice);

        int productId = 103;
        if (productPrices.containsKey(productId)) {
            System.out.println("Product ID " + productId + " is available for $" + productPrices.get(productId));
        }

        productPrices.remove(102);
        System.out.println("Updated Product Price List after removing Product ID 102: " + productPrices);
    }
}
