
import java.util.Scanner;

public class FirstNumIsSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();    
        int secondNum = sc.nextInt();    
        int thirdNum = sc.nextInt();
        if(firstNum < secondNum && firstNum < thirdNum) {
            System.out.println(firstNum + " is the smallest number");
        } else {
            System.out.println(firstNum + " is not the smallest number");
        }
    }
}
