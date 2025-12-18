import java.util.*;
public class KmToMiles2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextInt();
        double miles = km * 0.621371;
        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}

