import java.util.*;

public class OnlineExamApp {
    public static void main(String[] args) {

        try {
            Exam exam = new Exam("Java Test");

            exam.addQuestion(new ObjectiveQuestion(1, "What is JVM?", 5, "Java Virtual Machine"));
            exam.addQuestion(new DescriptiveQuestion(2, "Explain OOPS", 10));

            Student s1 = new Student(101, "Krishna");
            exam.enrollStudent(s1);

            Map<Integer, String> answers = new HashMap<>();
            answers.put(1, "Java Virtual Machine");
            answers.put(2, "OOPS includes inheritance, polymorphism, abstraction and encapsulation.");

            int score = exam.submitAnswers(answers);
            System.out.println("Total Score: " + score);

        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}
