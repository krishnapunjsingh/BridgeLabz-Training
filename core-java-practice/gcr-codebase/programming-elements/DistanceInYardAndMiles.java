
import java.util.Scanner;

public class DistanceInYardAndMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();
        Double Yard = distanceInFeet / 3;
        Double Miles  = Yard / 1760;
        System.out.print("The distance in Yard is " + Yard + " while the distancein Miles is " + Miles);
    }
}
