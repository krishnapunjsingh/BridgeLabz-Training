
import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci sequence");
        int term = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        for(int i=1;i<=term;i++){
            System.out.print(n1 + " ");
            int n3 = n1+n2;
            n1=n2;
            n2=n3;
        }

    }
}
