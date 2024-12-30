// The `this` keyword in Java is a reference variable that refers to the current object of the class.
// It is mainly used to:
// 1. Refer to the current instance variables (fields) of the class.
// 2. Invoke the current class constructor.
// 3. Pass the current object as a parameter to other methods.
// 4. Differentiate between instance variables and method parameters or local variables that have the same name.

// Class definition for ThisPerson
class ThisPerson {

    String name;
    int age;

    // Constructor to initialize instance variables using 'this'
    public ThisPerson(String name, int age) {
        this.name = name;  // 'this.name' refers to the instance variable 'name'
        this.age = age;    // 'this.age' refers to the instance variable 'age'
    }

    // Method to display information about the person
    public void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age); // Using 'this' to refer to instance variables
    }

    public static void main(String[] args) {
        // Creating an object of ThisPerson class
        ThisPerson person = new ThisPerson("John", 30);

        // Calling the display method to print the person's information
        person.display();
    }
}
