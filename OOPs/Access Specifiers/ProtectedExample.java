class Parent {
    protected int protectedValue;

    public Parent() {
        protectedValue = 100;
    }
}

public class ProtectedExample extends Parent {
    public void displayValue() {
        System.out.println("Protected Value: " + protectedValue); // Accessing protected variable
    }

    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        obj.displayValue(); // Subclass accessing protected variable
    }
}
