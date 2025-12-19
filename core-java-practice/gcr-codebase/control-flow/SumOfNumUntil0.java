
import java.util.Scanner;

public class SumOfNumUntil0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        while(true){
            double number = sc.nextDouble();
            if(number == 0){
                break;
            }
            else{
                sum+=number;
            }
        }
        System.out.print("total " +sum);
    }
}
