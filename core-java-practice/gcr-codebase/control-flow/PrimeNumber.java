
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;
        if(number <=1){
            isPrime = false;
            System.out.println("It is not a prime number , please enter a number greater than 1");
            return;
        } 

        for(int i=2; i<= Math.sqrt(number); i++){
            if(number %i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
}
