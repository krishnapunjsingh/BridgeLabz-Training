
import java.util.Scanner;

public class CounterForRocket2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        for(int i=counter; i>=1; i--){
            System.out.println("Rocket Launched in " + i);
        }
        System.out.print("Rocket Launched...");
    }
}
