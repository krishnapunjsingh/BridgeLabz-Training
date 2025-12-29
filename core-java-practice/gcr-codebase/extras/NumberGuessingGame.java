import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static int generateGuess(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    static String getFeedback(int guess) {
        System.out.print("Is the guess " + guess + " high, low, or correct? ");
        return sc.next().toLowerCase();
    }

    static void updateRange(String feedback, int guess, int[] range) {
        if (feedback.equals("low")) {
            range[0] = guess + 1;
        } else if (feedback.equals("high")) {
            range[1] = guess - 1;
        }
    }

    public static void main(String[] args) {

        int min = 1;
        int max = 100;
        int[] range = {min, max};

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (true) {
            int guess = generateGuess(range[0], range[1]);
            String feedback = getFeedback(guess);

            if (feedback.equals("correct")) {
                System.out.println("I guessed your number correctly.");
                break;
            } else if (feedback.equals("high") || feedback.equals("low")) {
                updateRange(feedback, guess, range);
            } else {
                System.out.println("Invalid input! Please type high, low, or correct.");
            }
        }
    }
}
