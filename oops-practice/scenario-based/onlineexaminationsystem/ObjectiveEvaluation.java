public class ObjectiveEvaluation implements EvaluationStrategy {
    public int evaluate(Question q, String answer) {
        return q.evaluate(answer);
    }
}

class DescriptiveEvaluation implements EvaluationStrategy {
    public int evaluate(Question q, String answer) {
        return q.evaluate(answer);
    }
}
