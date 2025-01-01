class Car {
    String model;
    int year;
    
    // Default Constructor
    public Car() {
        model = "Tesla";
        year = 2022;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class DefaultConstructorExample {
    public static void main(String[] args) {
        // Using Default Constructor
        Car car = new Car();
        car.display();
    }
}
