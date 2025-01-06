interface Animal {
    void makeSound();
    
    default void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        dog.makeSound();
        dog.sleep();

        cat.makeSound();
        cat.sleep();
    }
}
