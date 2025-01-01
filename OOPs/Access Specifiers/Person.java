public class Person {
    private String name;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Rajesh"); // Using setter
        System.out.println("Person's Name: " + person.getName()); // Using getter
    }
}
