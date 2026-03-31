import java.util.HashMap;

public class ExamMain {

    public static void main(String[] args) {

        ExamSession session = new ExamSession();

        session.visitQuestion(1);
        session.visitQuestion(2);
        session.visitQuestion(3);

        session.answerQuestion(1, "A");
        session.answerQuestion(2, "B");
        session.answerQuestion(3, "C");

        HashMap<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "C");
        correctAnswers.put(3, "C");

        int score = ExamEvaluator.calculateScore(
                session.getAnswers(),
                correctAnswers
        );

        System.out.println("\nFinal Score: " + score);
        System.out.println("Navigation History: " + session.getNavigationStack());
    }
}
