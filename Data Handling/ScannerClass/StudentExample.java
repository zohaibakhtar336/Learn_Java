import java.util.Scanner;

public class StudentExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter student's age: ");
        int age = sc.nextInt();

        System.out.print("Enter student's GPA (out of 5.0): ");
        double gpa = sc.nextDouble();

        sc.nextLine();

        System.out.print("Is the student enrolled full-time? (yes/no): ");
        String fullTimeStatus = sc.nextLine();

        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Full-time Enrollment: " + (fullTimeStatus.equalsIgnoreCase("yes") ? "Yes" : "No"));

        sc.close();
    }
}
