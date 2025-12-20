
import java.util.Scanner;

public class SumOfElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] numbers = new double[10];
        double sum = 0;
        int index = 0;
        while(true && index < 10){
            System.out.println("Enter a number");
            double num = sc.nextDouble();
            if(num <= 0){
                break;
            } 
            
            numbers[index] = num;
            index++;

        }
        for(int i=0;i<numbers.length;i++){
            sum += numbers[i];
        }
        System.out.println("Sum of elements of array is " + sum);

    }
}
