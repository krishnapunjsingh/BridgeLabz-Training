import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial smart card balance: ");
        int balance = sc.nextInt();

        while (balance > 0) {

            System.out.print("\nEnter distance traveled (in km) or -1 to quit: ");
            int distance = sc.nextInt();

            if (distance == -1) {
                break;
            }

            int fare = (distance <= 5) ? 10 : 20;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare: ₹" + fare);
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance. Please recharge.");
                break;
            }
        }

        System.out.println("\nThank you for using Delhi Metro Smart Card.");
    }
}
