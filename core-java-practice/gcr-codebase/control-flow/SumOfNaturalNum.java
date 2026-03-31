import java.util.Scanner;
public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <1){
            System.out.println("The number " + n + " is not a natural number");
        } 
        else{
            int sum = 0;
            for(int i=0;i<=n;i++){
                sum += i;
            }
            System.out.println("The Sum of " + n + " natural numbers is: " + sum);
        }
    }
}
