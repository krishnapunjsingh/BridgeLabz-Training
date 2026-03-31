
import java.util.Scanner;

public class FindQuotientAndReminder {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient = number/divisor;
        int reminder = number%divisor;
        return new int[]{quotient, reminder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int [] arr = findRemainderAndQuotient(num1, num2);
        System.out.println("The quotient is "+arr[0]+" the reminder is "+arr[1]);
    }
}
