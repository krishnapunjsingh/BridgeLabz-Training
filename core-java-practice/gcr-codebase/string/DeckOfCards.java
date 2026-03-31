import java.util.Scanner;

public class DeckOfCards {

    static String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
                              "Jack", "Queen", "King", "Ace" };

    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeDeck(String[] deck, int numPlayers, int numCardsPerPlayer) {
        if (numPlayers * numCardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] players = new String[numPlayers][numCardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < numCardsPerPlayer; i++) {
            for (int j = 0; j < numPlayers; j++) {
                players[j][i] = deck[cardIndex++];
            }
        }
        return players;
    }

    public static void printPlayersCards(String[][] players) {
        if (players == null) return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.print("Enter number of cards per player: ");
        int numCardsPerPlayer = scanner.nextInt();

        String[][] players = distributeDeck(deck, numPlayers, numCardsPerPlayer);

        printPlayersCards(players);

    }
}
