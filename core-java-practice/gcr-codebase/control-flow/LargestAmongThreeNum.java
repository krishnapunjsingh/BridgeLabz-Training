
import java.util.Scanner;

public class LargestAmongThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int thirdNum = sc.nextInt();
        if(firstNum >= secondNum && firstNum >= thirdNum) {
            System.out.println(firstNum + " is the largest number");
        } else if(secondNum >= firstNum && secondNum >= thirdNum) {
            System.out.println(secondNum + " is the largest number");
        } else {
            System.out.println(thirdNum + " is the largest number");
        }
    }
}
