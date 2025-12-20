
import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        while(temp != 0){
            int digit = temp %10;
            sum+=digit;
            temp = temp/10;
        }
        if(number % sum == 0){
            System.out.println("It is a Harshad number");
        }
        else{
            System.out.println("It is not a Harshad number");
        }
    }
}
