import java.util.Scanner;

class MovieTicketBookingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int customers = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= customers; i++) {
            System.out.println("\nCustomer " + i + ":");

            System.out.print("Enter movie type (2D/3D): ");
            String movieType = sc.nextLine().toUpperCase();

            int moviePrice = 0;
            switch (movieType) {
                case "2D":
                    moviePrice = 200;
                    break;
                case "3D":
                    moviePrice = 350;
                    break;
                default:
                    System.out.println("Invalid movie type! Defaulting to 2D.");
                    moviePrice = 200;
            }

            System.out.print("Enter seat type (Gold/Silver): ");
            String seatType = sc.nextLine().toUpperCase();

            int seatPrice = 0;
            switch (seatType) {
                case "GOLD":
                    seatPrice = 150;
                    break;
                case "SILVER":
                    seatPrice = 100;
                    break;
                default:
                    System.out.println("Invalid seat type! Defaulting to Silver.");
                    seatPrice = 100;
            }

        System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.nextLine().toLowerCase();
            int snacksPrice = 0;
            if (snacks.equals("yes")) {
                snacksPrice = 50;
            }

            int totalPrice = moviePrice + seatPrice + snacksPrice;

            System.out.println("Total amount to pay " + totalPrice);
        }
    }
}
