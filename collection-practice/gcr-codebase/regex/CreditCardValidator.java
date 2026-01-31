import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter credit card number:");
        String cardNumber = sc.nextLine();

        String regex = "^(4\\d{15}|5\\d{15})$";

        if (cardNumber.matches(regex)) {
            if (cardNumber.startsWith("4")) {
                System.out.println("Valid Visa card");
            } else {
                System.out.println("Valid MasterCard");
            }
        } else {
            System.out.println("Invalid credit card number");
        }

    }
}
