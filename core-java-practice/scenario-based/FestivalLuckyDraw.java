import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your lucky number (or type 'exit' to quit): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for participating in the Festival Lucky Draw!");
                break;
            }

            int number;
            try {
                number = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                continue; 
            }

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(" Congratulations! You have won a gift!");
            } else {
                System.out.println("Sorry, better luck next time!");
            }
        }
    }
}
