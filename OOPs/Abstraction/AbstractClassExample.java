abstract class Shape {
    abstract void draw();
    
    void display() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a Square.");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        
        circle.display();
        circle.draw();

        square.display();
        square.draw();
    }
}

