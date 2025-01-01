// Hybrid Inheritance (using interfaces):
// A combination of two or more inheritance types, achieved using interfaces.

interface Flyable {
    void fly();
}

interface Swimable {
    void swim();
}

interface Amphibian extends Flyable, Swimable {
    void adapt();
}

class Frog implements Amphibian {
    public void fly() {
        System.out.println("Frog doesn't actually fly but jumps high.");
    }

    public void swim() {
        System.out.println("Frog swims in water.");
    }

    public void adapt() {
        System.out.println("Frog adapts to both land and water.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.fly();   // From Flyable
        frog.swim();  // From Swimable
        frog.adapt(); // From Amphibian
    }
}
