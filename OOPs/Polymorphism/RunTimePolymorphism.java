// Run-time Polymorphism (Method Overriding)
// A subclass provides its own implementation of a method from the parent class.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal myAnimal; // Reference of parent class
        
        myAnimal = new Dog(); // Dog object
        myAnimal.sound();     // Calls Dog's overridden method
        
        myAnimal = new Cat(); // Cat object
        myAnimal.sound();     // Calls Cat's overridden method
    }
}
