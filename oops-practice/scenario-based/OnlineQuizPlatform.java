import java.util.ArrayList;

public class OnlineQuizPlatform {

    static class InvalidQuizSubmissionException extends Exception {
        InvalidQuizSubmissionException(String msg) {
            super(msg);
        }
    }

    static ArrayList<Integer> scoreList = new ArrayList<>();

    static int calculateScore(String[] correct, String[] user)
            throws InvalidQuizSubmissionException {

        if (correct.length != user.length) {
            throw new InvalidQuizSubmissionException(
                "Number of answers do not match"
            );
        }

        int score = 0;

        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(user[i])) {
                score++;
            }
        }

        return score;
    }

    static String getGrade(int score, int total) {
        int percent = (score * 100) / total;

        if (percent >= 80)
            return "A";
        else if (percent >= 60)
            return "B";
        else if (percent >= 40)
            return "C";
        else
            return "Fail";
    }

    public static void main(String[] args) {

        String[] correctAnswers = {"A", "B", "C", "D", "A"};

        String[] user1Answers = {"A", "B", "C", "A", "A"};
        String[] user2Answers = {"A", "C", "C", "D", "B"};

        try {
            int score1 = calculateScore(correctAnswers, user1Answers);
            scoreList.add(score1);
            System.out.println("User 1 Score: " + score1);
            System.out.println("User 1 Grade: " +
                    getGrade(score1, correctAnswers.length));

            int score2 = calculateScore(correctAnswers, user2Answers);
            scoreList.add(score2);
            System.out.println("\nUser 2 Score: " + score2);
            System.out.println("User 2 Grade: " +
                    getGrade(score2, correctAnswers.length));

        } catch (InvalidQuizSubmissionException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nAll User Scores: " + scoreList);
    }
}
