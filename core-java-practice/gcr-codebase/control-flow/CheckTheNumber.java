
import java.util.Scanner;

public class CheckTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 0) {
            System.out.println(number + " is a positive number");
        } else if(number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println("The number is zero");
        }   
    }
}
