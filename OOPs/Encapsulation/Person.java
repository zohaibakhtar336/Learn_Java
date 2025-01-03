public class Person {
    // Private fields (data hiding)
    private String name;
    private int age;

    // Public getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) { // Validate age
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }

    // Main method to test encapsulation
    public static void main(String[] args) {
        Person person = new Person();

        // Setting values using setters
        person.setName("Zohaib");
        person.setAge(22);

        // Getting values using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
