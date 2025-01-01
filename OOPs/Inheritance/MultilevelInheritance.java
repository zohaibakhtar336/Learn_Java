// Multilevel Inheritance:
// A class inherits from another class, which is itself a child of some other class.
// This forms a chain of inheritance.

class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks.");
    }
}

class Human extends Mammal {
    void think() {
        System.out.println("Human thinks.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();  // From Animal class
        human.walk(); // From Mammal class
        human.think(); // From Human class
    }
}
