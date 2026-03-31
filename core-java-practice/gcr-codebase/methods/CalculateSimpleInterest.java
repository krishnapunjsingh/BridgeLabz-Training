
import java.util.Scanner;


public class CalculateSimpleInterest{
    public static int calculateSimpleInterest(int principle, int rate, int time){
        int simpleInterest = (principle * rate* time)/100;
        return simpleInterest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle rate and time");
        int principle = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        int simpleInterest = calculateSimpleInterest(principle, rate, time);
        System.out.println("The Simple Interest is "+ simpleInterest + " for Principal "+ principle + " Rate of Interest " + rate + "and Time" + time );
    }
}