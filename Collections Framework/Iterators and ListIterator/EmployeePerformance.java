import java.util.*;

public class EmployeePerformance {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Imran");
        employees.add("Pooja");
        employees.add("Raj");
        employees.add("Anjali");

        Iterator<String> iterator = employees.iterator();

        System.out.println("Reviewing employee performance:");
        while (iterator.hasNext()) {
            String employee = iterator.next();
            System.out.println("Reviewing: " + employee);

            if (employee.equals("Raj")) {
                iterator.remove();
                System.out.println("Removed Raj due to poor performance.");
            }
        }

        System.out.println("Employees retained after performance review: " + employees);
    }
}
