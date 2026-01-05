import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Enter score for student " + (i + 1) + ": ");
                    scores[i] = sc.nextDouble();

                    if (scores[i] < 0) {
                        System.out.println("Invalid input! Score cannot be negative.");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a numeric value.");
                    sc.next(); // clear invalid input
                }
            }
        }

        double sum = 0;
        double highest = scores[0];
        double lowest = scores[0];

        for (double score : scores) {
            sum += score;
            if (score > highest)
                highest = score;
            if (score < lowest)
                lowest = score;
        }

        double average = sum / n;

        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        System.out.println("\nScores Above Average:");
        for (double score : scores) {
            if (score > average) {
                System.out.println(score);
            }
        }

    }
}
