import java.util.ArrayList;
import java.util.List;

public class QuizModel {
    private List<String> questions;
    private List<String[]> options;
    private List<String> correctAnswers;

    public QuizModel() {
        questions = new ArrayList<>();
        options = new ArrayList<>();
        correctAnswers = new ArrayList<>();

        // Add questions, options, and correct answers
        questions.add("What is the capital of France?");
        options.add(new String[]{"A) Paris", "B) London", "C) Berlin", "D) Rome"});
        correctAnswers.add("A");

        questions.add("Which programming language is used for Android development?");
        options.add(new String[]{"A) Python", "B) Java", "C) C++", "D) Swift"});
        correctAnswers.add("B");

        questions.add("Who developed Java?");
        options.add(new String[]{"A) James Gosling", "B) Dennis Ritchie", "C) Bjarne Stroustrup", "D) Guido van Rossum"});
        correctAnswers.add("A");
    }

    public String getQuestion(int index) {
        return questions.get(index);
    }

    public String[] getOptions(int index) {
        return options.get(index);
    }

    public String getCorrectAnswer(int index) {
        return correctAnswers.get(index);
    }

    public int getTotalQuestions() {
        return questions.size();
    }
}
