
import java.util.Scanner;

public class MaxHandShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxHandshakes = n * (n - 1) / 2;    
        System.out.println("Maximum number of handshakes among " + n + " people is: " + maxHandshakes);
    }
}
