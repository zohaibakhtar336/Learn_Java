interface IsEven {
    boolean check(int number);
}

public class EvenCheckExample {
    public static void main(String[] args) {
        // Using lambda expression to implement the check method
        IsEven evenCheck = number -> number % 2 == 0;
        
        // Calling the method using lambda
        System.out.println("Is 4 even? " + evenCheck.check(4));
        System.out.println("Is 7 even? " + evenCheck.check(7));
    }
}
