abstract class Question {
    int questionId;
    String questionText;
    int marks;

    Question(int questionId, String questionText, int marks) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.marks = marks;
    }

    abstract int evaluate(String answer);
}
