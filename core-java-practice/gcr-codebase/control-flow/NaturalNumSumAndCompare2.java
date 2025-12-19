
import java.util.Scanner;

public class NaturalNumSumAndCompare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;
        if(number <1){
            System.out.println("Invalid Input");
            return;
        } 
        for(int i=temp;i>0;i--){
            sum+=i;
        }
        int formula = (number * (number + 1)) / 2;
        if(sum == formula){
            System.out.println("Sum by loop " + sum + " Sum by formula " + formula + " Both are equal");
        } else {
            System.out.println("Sum by loop " + sum + " Sum by formula " + formula + " Both are not equal");
        }   
    }
}
