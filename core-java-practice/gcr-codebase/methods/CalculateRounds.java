
import java.util.Scanner;

public class CalculateRounds {
    public static int calculateNumbersOfRound(double s1,double s2, double s3){
        double perimeter = s1+s2+s3;
        Double totalDistance = 5000.0;
        return (int) Math.ceil(totalDistance/perimeter);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three sides of triangle ");
        double firstSide = sc.nextDouble();
        double secondSide = sc.nextDouble();
        double thirdSide = sc.nextDouble();
        int rounds = calculateNumbersOfRound(firstSide, secondSide, thirdSide);
        System.out.print("The total rounds is "+ rounds);

    }
}
