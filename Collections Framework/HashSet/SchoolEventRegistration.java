import java.util.*;

public class SchoolEventRegistration {
    public static void main(String[] args) {
        HashSet<String> studentNames = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        studentNames.add("Aarav");
        studentNames.add("Priya");
        studentNames.add("Neha");
        studentNames.add("Aarav");
        studentNames.add("Rohan");

        System.out.println("Current Registered Students: " + studentNames);

        System.out.print("Enter a name to check registration: ");
        String checkName = sc.nextLine();
        if (studentNames.contains(checkName)) {
            System.out.println(checkName + " is already registered.");
        } else {
            System.out.println(checkName + " is not registered yet.");
        }

        System.out.print("Enter a name to remove: ");
        String removeName = sc.nextLine();
        if (studentNames.remove(removeName)) {
            System.out.println(removeName + " has been removed from the registration list.");
        } else {
            System.out.println(removeName + " was not found in the list.");
        }

        System.out.println("Final List of Registered Students: " + studentNames);
        System.out.println("Total Registered Students: " + studentNames.size());

        sc.close();
    }
}
