class Bus {
    String model;
    int year;

    // Parameterized Constructor
    public Bus(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Bus Model: " + model + ", Year: " + year);
    }
}

public class ParameterizedConstructorExample {
    public static void main(String[] args) {
        // Using Parameterized Constructor
        Bus bus1 = new Bus("Volvo", 2020);
        bus1.display();
    }
}
