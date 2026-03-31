
import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial");
        int number = sc.nextInt();
        if(number <0){
            System.out.print("enter a positive number");
            return;
        }
        int factorial = 1;
        for(int i=number;i>=1;i--){
            factorial *= i;
        }
        System.out.print("Factorial of " + number + " is " + factorial);
    }
}
