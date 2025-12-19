
import java.util.Scanner;

public class NaturalNumSumAndCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number <= 0) {
            System.out.println("Please enter a natural number greater than 0");
            return;
        }
        int sum = 0;
        int temp = number;
        while(temp > 0){
            sum += temp;
            temp--;
        }
        int formulaSum = number * (number + 1) / 2;
        if(formulaSum == sum) {
            System.out.println("The sums are equal by both by loop and by formula : " + sum);
        } else {
            System.out.println("The sums are not equal. Loop sum: " + sum + ", Formula sum: " + formulaSum);
        }   
    }
}
