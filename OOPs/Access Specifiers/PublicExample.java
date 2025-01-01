public class PublicExample {
    public int value;

    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.value = 100; // Accessing public variable
        System.out.println("Public Value: " + obj.value);
    }
}
