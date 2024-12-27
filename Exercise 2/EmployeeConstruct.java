public class EmployeeConstruct{
    int id;
    String name;
    double salary;

public EmployeeConstruct(int id, String name, double salary){
    this.id = id;
    this.name = name;
    this.salary = salary;
}

public void displayEmployeeInfo(){
    System.out.println("Employee ID: " + id);
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + salary);
}

public static void main(String[] args) {
    EmployeeConstruct book1 = new EmployeeConstruct(7, "John Doe", 5000);
    book1.displayEmployeeInfo();
}
}
