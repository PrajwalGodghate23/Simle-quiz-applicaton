public class QuizController {
    private QuizModel model;
    private QuizView view;

    public QuizController(QuizModel model, QuizView view) {
        this.model = model;
        this.view = view;
    }

    public void startQuiz() {
        int score = 0;
        int totalQuestions = model.getTotalQuestions();

        for (int i = 0; i < totalQuestions; i++) {
            String question = model.getQuestion(i);
            String[] options = model.getOptions(i);
            view.displayQuestion(question, options);

            String userAnswer = view.getUserAnswer();
            String correctAnswer = model.getCorrectAnswer(i);

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + correctAnswer);
            }
        }

        view.displayScore(score, totalQuestions);
    }
}
