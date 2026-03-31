import java.util.HashMap;
import java.util.Map;

public class ExamEvaluator {

    public static int calculateScore(
            HashMap<Integer, String> studentAnswers,
            HashMap<Integer, String> correctAnswers) {

        int score = 0;

        for (Map.Entry<Integer, String> entry : correctAnswers.entrySet()) {
            int questionId = entry.getKey();
            String correctAnswer = entry.getValue();

            if (correctAnswer.equals(studentAnswers.get(questionId))) {
                score++;
            }
        }
        return score;
    }
}
