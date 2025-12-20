
import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gstRate = 0.05;
        while (true) { 
            System.out.println("Coffee Types ");
            System.out.println("1. Espresso - Rs.100");
            System.out.println("2. Cappuccino - Rs.120");
            System.out.println("3. Latte - Rs.150");
            System.out.println("Type 'exit' to stop");

            System.out.print("Enter a choice ");
            String coffeeChoice = sc.next();
            if(coffeeChoice.equals("exit") || coffeeChoice.equals("exit") ){
                System.out.print("exit");
                break;
            }
            double price = 0;
            switch (coffeeChoice){
                case "1":
                    price = 100;
                    break;
                case "2":
                    price = 120;
                    break;
                case "3":
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid... Try again.");
                    continue;            
            }
            System.out.print("Quantity....!");
            int quantity = sc.nextInt();

            double bill = price * quantity;
            double gst = gstRate*bill;
            double finalBill = bill + gst;

            System.out.println("Bill Amount Rs " + bill);
            System.out.println("GST Rs " + gst);
            System.out.println("Final Bill Rs " + finalBill);

        }
    }
}
