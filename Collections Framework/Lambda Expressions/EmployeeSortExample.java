import java.util.*;

class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class EmployeeSortExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("Zohaib", 22),
            new Employee("Ajay", 30),
            new Employee("Mohammad", 28),
            new Employee("Kavya", 20)
        ));

        Collections.sort(employees, (e1, e2) -> Integer.compare(e1.age, e2.age));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
