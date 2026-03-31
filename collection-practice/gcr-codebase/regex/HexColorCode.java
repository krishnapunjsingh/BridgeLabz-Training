
import java.util.Scanner;

public class HexColorCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hex color code:");
        String hexColor = sc.nextLine();
        String regex = "^#[0-9A-Fa-f]{6}$";
        if(hexColor.matches(regex)){
            System.out.println("Valid hex color code");
        } else {
            System.out.println("Invalid hex color code");
        }
    }
}
