
import java.util.Scanner;

public class SumOfNNaturalNumber {
    public static int calculateSum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
           sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum is "+ calculateSum(n));
    }
}
