import java.util.*;

public class StudentEventTracker {
    public static void main(String[] args) {
        LinkedHashSet<Integer> studentIDs = new LinkedHashSet<>();
        
        studentIDs.add(101);
        studentIDs.add(102);
        studentIDs.add(103);
        studentIDs.add(101);
        
        System.out.println("Students who registered: " + studentIDs);
        
        System.out.println("Is student with ID 102 registered? " + studentIDs.contains(102));
        
        studentIDs.remove(103);
        System.out.println("Students after removal: " + studentIDs);
        
        System.out.println("Registered students in order: ");
        for (Integer studentID : studentIDs) {
            System.out.println("Student ID: " + studentID);
        }
    }
}
