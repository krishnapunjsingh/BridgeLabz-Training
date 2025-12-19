
import java.util.Scanner;

public class FindFactorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int factorial = 1;
        if(number < 0){
            System.out.print("enter a postive number");
            return;
        }
        while(number >=1){
            factorial *= number;
            number--;
        }
        System.out.print("Factorial of the number " +temp+ " is " + factorial);
    }
}
