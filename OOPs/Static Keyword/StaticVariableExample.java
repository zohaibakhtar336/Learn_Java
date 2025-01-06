public class StaticVariableExample {
    // Static variable
    static String message = "Hello, Static!";

    public static void main(String[] args) {
        // Accessing static variable directly using class name
        System.out.println(StaticVariableExample.message);

        // Modifying static variable through object
        StaticVariableExample obj1 = new StaticVariableExample();
        obj1.message = "Updated message!";
        System.out.println(StaticVariableExample.message);
    }
}
