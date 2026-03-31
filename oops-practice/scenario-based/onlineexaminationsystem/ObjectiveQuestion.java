class ObjectiveQuestion extends Question {
    String correctAnswer;

    ObjectiveQuestion(int id, String text, int marks, String correctAnswer) {
        super(id, text, marks);
        this.correctAnswer = correctAnswer;
    }

    @Override
    int evaluate(String answer) {
        return answer.equalsIgnoreCase(correctAnswer) ? marks : 0;
    }
}
