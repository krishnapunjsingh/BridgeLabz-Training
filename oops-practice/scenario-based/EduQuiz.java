public class EduQuiz {

    // Method to calculate score
    static int calculateScore(String[] correct, String[] student) {
        int score = 0;

        for (int i = 0; i < correct.length; i++) {
            if (student[i].equalsIgnoreCase(correct[i])) {
                score++;
            }
        }
        return score;
    }

    // Main method
    public static void main(String[] args) {

        // Correct answers
        String[] correctAnswers = {
                "A", "C", "B", "D", "A",
                "B", "C", "D", "A", "B"
        };

        // Student answers
        String[] studentAnswers = {
                "a", "c", "b", "a", "A",
                "B", "d", "D", "A", "C"
        };

        int score = calculateScore(correctAnswers, studentAnswers);

        // Detailed feedback
        for (int i = 0; i < correctAnswers.length; i++) {
            System.out.print("Question " + (i + 1) + ": ");
            if (studentAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect");
            }
        }

        // Bonus: percentage and pass/fail
        double percentage = (score / 10.0) * 100;

        System.out.println("\nScore: " + score + "/10");
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
