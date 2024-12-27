public class CarConstruct {

    String name;
    int year;
    String color;

    public CarConstruct(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public void displayCarInfo() {
        System.out.println("Car Name: " + name);
        System.out.println("Car Year: " + year);
        System.out.println("Car Color: " + color);
    }

    public static void main(String[] args) {
        CarConstruct car1 = new CarConstruct("BMW", 2024, "Black");
        car1.displayCarInfo();
    }
}
