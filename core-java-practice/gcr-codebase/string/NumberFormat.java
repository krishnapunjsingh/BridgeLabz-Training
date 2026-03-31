
import java.util.Scanner;

public class NumberFormat {
    public static void createException(String text){
        int number = Integer.parseInt(text);
        System.out.println(number);
    }
    public static void handleException(String text){
        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.print("Exception " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        try {
            createException(input);
        } catch (Exception e) {
            System.out.print("Exception " + e);
        }
        handleException(input);

    }
}
