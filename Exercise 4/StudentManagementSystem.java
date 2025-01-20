class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student("Aamir", 101);
        student1.displayDetails();
    }
}
