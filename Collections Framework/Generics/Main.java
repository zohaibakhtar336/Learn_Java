class Inventory<T> {
    private T item;

    public void add(T item) {
        this.item = item;
        System.out.println("Added to inventory: " + item);
    }

    public T getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        Inventory<String> store = new Inventory<>();
        store.add("Laptop");
        System.out.println("Retrieved: " + store.getItem());
    }
}
