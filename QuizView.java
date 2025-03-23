import java.util.Scanner;

public class QuizView {
    private Scanner scanner;

    public QuizView() {
        scanner = new Scanner(System.in);
    }

    public void displayQuestion(String question, String[] options) {
        System.out.println(question);
        for (String option : options) {
            System.out.println(option);
        }
    }

    public String getUserAnswer() {
        System.out.print("Enter your answer (A, B, C, D): ");
        return scanner.nextLine().toUpperCase();
    }

    public void displayScore(int score, int totalQuestions) {
        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + " out of " + totalQuestions);
    }
}
