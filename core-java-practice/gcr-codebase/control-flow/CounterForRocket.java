
import java.util.Scanner;

public class CounterForRocket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        while(counter >= 1){
            System.out.println("Rocket launched in: " + counter);
            counter--;
        }
        System.out.println("Rocket Launched...");
    }
}
