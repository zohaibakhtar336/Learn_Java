public class PriceCalculator {
    public static void main(String[] args) {
        int items = 25;
        double pricePerItem = 50;
        double discount = 0;

        if (items <= 10) {
            discount = 0.05;
        } else if (items <= 20) {
            discount = 0.10;
        } else if (items <= 30) {
            discount = 0.15;
        } else if (items <= 50) {
            discount = 0.20;
        }

        double totalPrice = items * pricePerItem;
        double discountedPrice = totalPrice - (totalPrice * discount);

        System.out.println("Total price before discount: " + totalPrice);
        System.out.println("Discount applied: " + (discount * 100) + "%");
        System.out.println("Total price after discount: " + discountedPrice);
    }
}
