import java.util.*;

class Exam {
    String examName;
    List<Question> questions = new ArrayList<>();
    Map<Integer, Student> students = new HashMap<>();
    boolean isExpired = false;

    Exam(String examName) {
        this.examName = examName;
    }

    void addQuestion(Question q) {
        questions.add(q);
    }

    void enrollStudent(Student s) {
        students.put(s.id, s);
    }

    int submitAnswers(Map<Integer, String> answers) throws ExamTimeExpiredException {
        if (isExpired)
            throw new ExamTimeExpiredException("Exam time is over!");

        int totalScore = 0;

        for (Question q : questions) {
            totalScore += q.evaluate(answers.get(q.questionId));
        }
        return totalScore;
    }

    void expireExam() {
        isExpired = true;
    }
}
