import java.util.*;

public class StudentManagementSystem {

    public static void main(String args[]) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Ali");
        students.add("Ahmed");
        students.add("Bilal");

        System.out.println("All students are: " + students);

        students.remove("Ahmed");
        System.out.println("After removing Ahmed: " + students);
        String searchName = "Ali";
        if(students.contains(searchName)){
            System.out.println(searchName + " is present in the list");
        }else{
            System.out.println(searchName + " is not present in the list");
        }

        String checkName ="Ahmed";
        System.out.println("Is " + checkName + " present in the list: " + students.contains(checkName));

        students.clear();
        System.out.println("All students after clearing: " + students);
    }
}
