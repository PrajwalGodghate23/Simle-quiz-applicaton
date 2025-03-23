public class Main {
    public static void main(String[] args) {
        QuizModel model = new QuizModel();
        QuizView view = new QuizView();
        QuizController controller = new QuizController(model, view);

        controller.startQuiz();
    }
}
