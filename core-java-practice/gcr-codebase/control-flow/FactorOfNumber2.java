
import java.util.Scanner;

public class FactorOfNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counter = 1;
        while(counter < number){
            if(number % counter == 0){
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
}
