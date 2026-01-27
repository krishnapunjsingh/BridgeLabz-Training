
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();

            int ans  = a/b;
            System.out.println("result: " + ans);
        } catch (ArithmeticException e) {
             System.out.println("Error: Division by zero is not allowed");
        }
        catch(InputMismatchException e){
            System.out.println("Error: Please enter valid numeric values");
        }

    }
}
