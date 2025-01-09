import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
            System.out.println("Your age is: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
        }
    }
}
