
import java.util.Scanner;

public class MultipleOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number < 0 || number > 100){
            System.out.println("Invalid Input... please enter number between 0 to 100");
        }
        for(int i=100;i>=1;i--){
            if(number % i ==0){
                System.out.print(i + " ");
            }
        }
    }
}
