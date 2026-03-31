import java.util.HashMap;
import java.util.Stack;

public class ExamSession {

    private Stack<Integer> navigationStack = new Stack<>();
    private HashMap<Integer, String> answers = new HashMap<>();

    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    public void answerQuestion(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    public Stack<Integer> getNavigationStack() {
        return navigationStack;
    }

    public HashMap<Integer, String> getAnswers() {
        return answers;
    }
}
