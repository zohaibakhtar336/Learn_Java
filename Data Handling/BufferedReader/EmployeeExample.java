import java.io.*;

public class EmployeeExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter employee name: ");
        String name = br.readLine();

        System.out.print("Enter employee age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter employee salary: ");
        double salary = Double.parseDouble(br.readLine());

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        br.close();
    }
}
