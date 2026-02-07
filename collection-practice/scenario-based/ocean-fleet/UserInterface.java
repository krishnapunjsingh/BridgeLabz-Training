import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VesselUtil util = new VesselUtil();
        System.out.println("Enter the number of vessels: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter vessel details: "); //like V001:Sea King:25.5:Cargo
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] data = input.split(":");
            Vessel vessel = new Vessel(data[0],data[1],Double.pa rseDouble(data[2]),data[3]);
            util.addVesselPerformance(vessel);
        }
        System.out.println("Enter the Vessel Id to check speed");
        String searchId = sc.nextLine();

        Vessel foundVessel = util.getVesselById(searchId);

        if (foundVessel != null) {
            System.out.println(foundVessel.getVesselId() + " | " +
                               foundVessel.getVesselName() + " | " +
                               foundVessel.getVesselType() + " | " +
                               foundVessel.getAverageSpeed() + " knots");
        } else {
            System.out.println("Vessel Id " + searchId + " not found");
        }

        System.out.println("High performance vessels are");
        List<Vessel> highPerf = util.getHighPerformanceVessels();

        for (Vessel v : highPerf) {
            System.out.println(v.getVesselId() + " | " +
                               v.getVesselName() + " | " +
                               v.getVesselType() + " | " +
                               v.getAverageSpeed() + " knots");
        }
    }
}