
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        int digits = 0;
        while(temp != 0){
            digits++;
            temp = temp / 10;
        }
        temp = number;
        while(temp !=0){
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp/10;
        }
        if(sum == number ){
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("It is not an armstrong number");
        }
    }
}
