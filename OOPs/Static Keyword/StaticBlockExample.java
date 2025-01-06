public class StaticBlockExample {
    
    // Static variable
    static int staticVar;

    // Static block (executes when the class is loaded)
    static {
        staticVar = 100;
        System.out.println("Static block: staticVar = " + staticVar);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
    }
}
