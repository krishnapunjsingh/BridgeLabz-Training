
import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDistance = 0;
        System.out.println("Do you want to add a new bus route distance? (y/n)");
        char choice=sc.next().charAt(0);
        while(choice=='y' || choice =='Y'){
            System.out.print("Enter the distance of the bus route in kilometers: ");
            int distance = sc.nextInt();
            totalDistance += distance;
            System.out.println("Do you want to add another bus route distance? (y/n)");
            choice=sc.next().charAt(0);
        }
        System.out.println("passenger get off");
        System.out.println("Total distance of all bus routes: " + totalDistance + " kilometers");
    }
}
