class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

public class InventoryManagement {
    private int stock;

    public InventoryManagement(int initialStock) {
        this.stock = initialStock;
    }

    public void addProduct(int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Quantity must be positive.");
        } else {
            stock += quantity;
            System.out.println(quantity + " product(s) added. Current stock: " + stock);
        }
    }

    public void removeProduct(int quantity) throws OutOfStockException {
        if (quantity > stock) {
            throw new OutOfStockException("Error: Not enough stock to remove.");
        }
        stock -= quantity;
        System.out.println(quantity + " product(s) removed. Current stock: " + stock);
    }

    public void checkStock() {
        System.out.println("Current stock: " + stock);
    }

    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement(100);
        
        inventory.checkStock();
        inventory.addProduct(50);

        try {
            inventory.removeProduct(120);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }

        inventory.checkStock();
    }
}
