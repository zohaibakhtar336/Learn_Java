import java.util.*;

public class StudentRecordSystem {
    public static void main(String[] args) {
        
        LinkedList<String> studentNames = new LinkedList<>();
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        
        Scanner sc = new Scanner(System.in);
        
        studentNames.add("Haseeb");
        rollNumbers.add(101);
        
        studentNames.add("Majid");
        rollNumbers.add(102);
        
        studentNames.add("Amjad");
        rollNumbers.add(103);
        
        System.out.println("Student Records:");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println("Roll No: " + rollNumbers.get(i) + ", Name: " + studentNames.get(i));
        }

        System.out.println("\nEnter new student name: ");
        String newName = sc.nextLine();
        System.out.println("Enter roll number: ");
        int newRollNumber = sc.nextInt();
        
        studentNames.add(newName);
        rollNumbers.add(newRollNumber);

        System.out.println("\nEnter roll number to search: ");
        int searchRollNumber = sc.nextInt();
        
        int index = rollNumbers.indexOf(searchRollNumber);
        if (index != -1) {
            System.out.println("Student Found: " + studentNames.get(index));
        } else {
            System.out.println("Student not found!");
        }

        System.out.println("\nEnter roll number to remove: ");
        int removeRollNumber = sc.nextInt();
        
        int removeIndex = rollNumbers.indexOf(removeRollNumber);
        if (removeIndex != -1) {
            studentNames.remove(removeIndex);
            rollNumbers.remove(removeIndex);
            System.out.println("Student removed!");
        } else {
            System.out.println("Student not found!");
        }

        System.out.println("\nUpdated Student Records:");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println("Roll No: " + rollNumbers.get(i) + ", Name: " + studentNames.get(i));
        }

        sc.close();
    }
}
