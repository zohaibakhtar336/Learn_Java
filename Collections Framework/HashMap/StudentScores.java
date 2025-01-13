import java.util.*;

public class StudentScores {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Rahul", 85);
        studentScores.put("Amit", 92);
        studentScores.put("Priya", 78);
        studentScores.put("Neha", 88);

        System.out.println("Student Scores: " + studentScores);

        int amitScore = studentScores.get("Amit");
        System.out.println("Amit's score: " + amitScore);

        studentScores.put("Priya", 82);
        System.out.println("Updated Student Scores: " + studentScores);

        studentScores.put("Sita", 95);
        System.out.println("Student Scores after adding Sita: " + studentScores);
    }
}
