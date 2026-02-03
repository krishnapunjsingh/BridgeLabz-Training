
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Arm Precision (0.0 - 1.0):");
            double armPrecision = sc.nextDouble();

            System.out.println("Enter Worker Density (1 - 20):");
            int workerDensity = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
            String state = sc.nextLine();

            double risk = calculateHazardRisk(
                    armPrecision, workerDensity, state
            );

            System.out.println("Robot Hazard Risk Score: " + risk);

        } catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculateHazardRisk(
            double armPrecision,
            int workerDensity,
            String machineryState
    ) throws RobotSafetyException {

        if (armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException("Invalid arm precision");
        }

        if (workerDensity < 1 || workerDensity > 20) {
            throw new RobotSafetyException("Invalid worker density");
        }

        double machineRiskFactor;

        if (machineryState.equalsIgnoreCase("Worn")) {
            machineRiskFactor = 1.3;
        } else if (machineryState.equalsIgnoreCase("Faulty")) {
            machineRiskFactor = 2.0;
        } else if (machineryState.equalsIgnoreCase("Critical")) {
            machineRiskFactor = 3.0;
        } else {
            throw new RobotSafetyException("Invalid machinery state");
        }

        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineRiskFactor);
    

	}

}