class DefaultExample {
    int defaultValue;

    public DefaultExample() {
        defaultValue = 50;
    }
}

public class TestDefault {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        System.out.println("Default Value: " + obj.defaultValue); // Accessing within the same package
    }
}
