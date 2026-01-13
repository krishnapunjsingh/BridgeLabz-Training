class DescriptiveQuestion extends Question {

    DescriptiveQuestion(int id, String text, int marks) {
        super(id, text, marks);
    }

    @Override
    int evaluate(String answer) {
        return answer.length() > 10 ? marks : marks / 2;
    }
}
