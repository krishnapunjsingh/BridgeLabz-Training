class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}

public class StudentScoreAnalyzer {

    static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    static int findMax(int[] scores) {
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    static int findMin(int[] scores) {
        int min = scores[0];
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    static void validateScores(int[] scores) throws InvalidScoreException {
        for (int score : scores) {
            if (score < 0 || score > 100) {
                throw new InvalidScoreException(
                    "Invalid score found: " + score + " (Score must be between 0 and 100)"
                );
            }
        }
    }

    public static void main(String[] args) {

        int[] studentScores = {78, 85, 92, 67, 88};

        try {
            validateScores(studentScores);

            System.out.println("Average Score: " + calculateAverage(studentScores));
            System.out.println("Highest Score: " + findMax(studentScores));
            System.out.println("Lowest Score: " + findMin(studentScores));

        } catch (InvalidScoreException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
