
import java.util.Scanner;

public class MaximumOfThreeNumbers {
    public static int maxOfThree(int a, int b, int c){
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        int maximum = maxOfThree(num1, num2, num3);
        System.out.println("The maximum of the three numbers is " + maximum);
        
    }
}
