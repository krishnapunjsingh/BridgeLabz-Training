
import java.util.Scanner;

public class LicensePlateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter license plate number:");
        String licensePlate = sc.nextLine();
        String regex = "^[A-Z]{2}[0-9]{4}$";
        if(licensePlate.matches(regex)){
            System.out.println("Valid license plate number");
        } else {
            System.out.println("Invalid license plate number");
        }
    }
}
