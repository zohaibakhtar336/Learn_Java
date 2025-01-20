import java.util.*;

public class OnlineQuizApp {
    static class Question {
        String questionText;
        String[] options;
        String correctAnswer;

        public Question(String questionText, String[] options, String correctAnswer) {
            this.questionText = questionText;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }

        public boolean checkAnswer(String answer) {
            return correctAnswer.equalsIgnoreCase(answer);
        }
    }

    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of India?", new String[]{"Delhi", "Mumbai", "Chennai", "Kolkata"}, "Delhi"));
        questions.add(new Question("Who is the founder of Microsoft?", new String[]{"Steve Jobs", "Mark Zuckerberg", "Bill Gates", "Larry Page"}, "Bill Gates"));
        questions.add(new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Venus", "Jupiter"}, "Mars"));
        questions.add(new Question("What is the largest animal in the world?", new String[]{"Elephant", "Whale", "Shark", "Giraffe"}, "Whale"));
        questions.add(new Question("Which programming language is known as the 'mother of all languages'?", new String[]{"C", "Java", "Assembly", "Fortran"}, "C"));
        questions.add(new Question("What is the fastest land animal?", new String[]{"Lion", "Tiger", "Cheetah", "Elephant"}, "Cheetah"));
        questions.add(new Question("Who wrote the play 'Romeo and Juliet'?", new String[]{"Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain"}, "William Shakespeare"));
        questions.add(new Question("In which year did India gain independence?", new String[]{"1947", "1950", "1960", "1975"}, "1947"));
        questions.add(new Question("What is the chemical symbol for water?", new String[]{"H2O", "O2", "CO2", "H2"}, "H2O"));
        questions.add(new Question("Which country is known as the Land of the Rising Sun?", new String[]{"China", "India", "Japan", "Korea"}, "Japan"));

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            System.out.println(question.questionText);
            for (int i = 0; i < question.options.length; i++) {
                System.out.println((i + 1) + ". " + question.options[i]);
            }
            System.out.print("Enter your answer: ");
            String answer = scanner.nextLine();
            if (question.checkAnswer(answer)) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }
        }
        System.out.println("Your total score is: " + score + "/" + questions.size());
        scanner.close();
    }
}
