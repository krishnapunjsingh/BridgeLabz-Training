import java.util.Scanner;

public class RockPaperScissor {

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    public static String findWinner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if (user.equals("Rock") && computer.equals("Scissors") ||
            user.equals("Paper") && computer.equals("Rock") ||
            user.equals("Scissors") && computer.equals("Paper"))
            return "Player";

        return "Computer";
    }

    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];

        double playerPercent = (playerWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;

        stats[0][0] = "Player";
        stats[0][1] = playerWins + "";
        stats[0][2] = playerPercent + "%";

        stats[1][0] = "Computer";
        stats[1][1] = computerWins + "";
        stats[1][2] = computerPercent + "%";

        return stats;
    }

    public static void displayResults(String[][] games, String[][] stats) {

        System.out.println("\nGame\tPlayer\tComputer\tWinner");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t" + games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nName\tWins\tWin Percentage");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        String[][] games = new String[n][3];
        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Enter choice for game " + (i + 1) + " (Rock/Paper/Scissors): ");
            String userChoice = sc.next();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            games[i][0] = userChoice;
            games[i][1] = computerChoice;
            games[i][2] = winner;

            if (winner.equals("Player"))
                playerWins++;
            else if (winner.equals("Computer"))
                computerWins++;
        }

        String[][] stats = calculateStats(playerWins, computerWins, n);
        displayResults(games, stats);

    }
}
