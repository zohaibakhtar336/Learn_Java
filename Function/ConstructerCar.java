/*
 * What is a Constructor in Java?
 * - A constructor is a special method used to initialize objects in Java.
 * - It is called automatically when an object is created.
 * - The name of the constructor must be the same as the class name.
 * - Constructors do not have a return type (not even void).

 * Types of Constructors:
 * 1. Default Constructor: 
 *    - A constructor with no parameters.
 *    - If you don't define any constructor, Java provides a default constructor.

 * 2. Parameterized Constructor:
 *    - A constructor that accepts parameters to initialize the object with specific values.

 * Key Points:
 * - Constructors are used to initialize the state of an object.
 * - They are called only once, at the time of object creation.
 * - You can overload constructors (use multiple constructors in a class with different parameter lists).

 * Syntax:
 * class ClassName {
 *     // Constructor
 *     ClassName() {
 *         // Initialization code
 *     }
 * }
 */

 // Parameterized Constructor Example

class ConstructerCar {
    // Instance variables
    String brand;
    int year;

    // Parameterized Constructor
    public ConstructerCar(String brand, int year) {
        // Initialize with given values
        this.brand = brand;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    // Main method to test the constructor
    public static void main(String[] args) {
        // Creating an object of Car using the parameterized constructor
        ConstructerCar myCar = new ConstructerCar("Honda", 2022); // Passing values to constructor
        myCar.displayDetails(); // Display details of the car
    }
}

