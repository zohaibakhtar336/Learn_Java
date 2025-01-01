class Bike {
    String model;
    int year;

    // Default Constructor
    public Bike() {
        model = "Honda";
        year = 2018;
    }

    // Copy Constructor
    public Bike(Bike other) {
        this.model = other.model;
        this.year = other.year;
    }

    void display() {
        System.out.println("Bike Model: " + model + ", Year: " + year);
    }
}

public class CopyConstructorExample {
    public static void main(String[] args) {
        // Using Default Constructor
        Bike bike1 = new Bike();
        bike1.display();

        // Using Copy Constructor
        Bike bike2 = new Bike(bike1);
        bike2.display();
    }
}
