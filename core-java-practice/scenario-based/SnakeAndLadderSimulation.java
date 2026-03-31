import java.util.Scanner;

public class SnakeAndLadderSimulation {

    public static int diceRoll() {
        return (int)(Math.random() * 6) + 1;
    }

    public static String selectOption() {
        int option = (int)(Math.random() * 3);
        if (option == 0) {
            return "Same Position";
        } else if (option == 1) {
            return "Ladder";
        } else {
            return "Snake";
        }
    }

    public static int updatePosition(String option, int diceValue, int position) {

        if (option.equalsIgnoreCase("Ladder") && position + diceValue <= 100) {
            position += diceValue;
        }
        else if (option.equalsIgnoreCase("Snake")) {
            if (position - diceValue < 0) {
                position = 0;
            } else {
                position -= diceValue;
            }
        }
        // Same Position  no change

        return position;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for 1 player or 2 for 2 players:");
        int player = sc.nextInt();

        if (player == 1) {

            int position = 0;
            int diceCount = 0;

            while (position < 100) {
                diceCount++;
                int diceValue = diceRoll();
                String option = selectOption();
                position = updatePosition(option, diceValue, position);
            }

            System.out.println("You won the Game!");
            System.out.println("Total dice rolled: " + diceCount);
        }
        else {

            int player1Pos = 0;
            int player2Pos = 0;
            int diceCount = 0;
            boolean player1Turn = true;

            while (player1Pos < 100 && player2Pos < 100) {
                diceCount++;

                int diceValue = diceRoll();
                String option = selectOption();

                if (player1Turn) {
                    player1Pos = updatePosition(option, diceValue, player1Pos);
                    if (!option.equalsIgnoreCase("Ladder")) {
                        player1Turn = false;
                    }
                } else {
                    player2Pos = updatePosition(option, diceValue, player2Pos);
                    if (!option.equalsIgnoreCase("Ladder")) {
                        player1Turn = true;
                    }
                }
            }

            if (player1Pos >= 100) {
                System.out.println("Player 1 won the game");
            } else {
                System.out.println("Player 2 won the game");
            }

            System.out.println("Total dice rolled: " + diceCount);
        }

    }
}
