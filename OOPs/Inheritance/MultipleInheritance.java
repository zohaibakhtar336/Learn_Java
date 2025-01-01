// Multiple Inheritance (using interfaces):
// A class can implement multiple interfaces to achieve multiple inheritance.
// This avoids ambiguity present in class-based multiple inheritance.

interface Animal {
    void eat();
}

interface Playable {
    void play();
}

class Dog implements Animal, Playable {
    public void eat() {
        System.out.println("Dog eats food.");
    }

    public void play() {
        System.out.println("Dog plays fetch.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // From Animal
        dog.play(); // From Playable
    }
}
