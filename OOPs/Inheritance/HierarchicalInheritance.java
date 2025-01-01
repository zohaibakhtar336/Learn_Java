// Hierarchical Inheritance:
// Multiple child classes inherit from a single parent class.
// This allows sharing of common features from the parent.

class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // From Animal
        dog.bark(); // From Dog

        Cat cat = new Cat();
        cat.eat();  // From Animal
        cat.meow(); // From Cat
    }
}
