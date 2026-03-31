import java.util.HashMap;
import java.util.Map;

public class FlightUtil {

    public boolean validateFlightNumber(String flightNumber)
            throws InvalidFlightException {

        if (!flightNumber.matches("FL-[1-9][0-9]{3}")) {
            throw new InvalidFlightException(
                "The flight number " + flightNumber + " is invalid"
            );
        }
        return true;
    }

    public boolean validateFlightName(String flightName)
            throws InvalidFlightException {

        if (!(flightName.equals("SpiceJet") ||
              flightName.equals("Vistara") ||
              flightName.equals("IndiGo") ||
              flightName.equals("Air Arabia"))) {

            throw new InvalidFlightException(
                "The flight name " + flightName + " is invalid"
            );
        }
        return true;
    }

    public boolean validatePassengerCount(int passengerCount, String flightName)
            throws InvalidFlightException {

        Map<String, Integer> capacityMap = new HashMap<>();
        capacityMap.put("SpiceJet", 396);
        capacityMap.put("Vistara", 615);
        capacityMap.put("IndiGo", 230);
        capacityMap.put("Air Arabia", 130);

        int maxCapacity = capacityMap.get(flightName);

        if (passengerCount <= 0 || passengerCount > maxCapacity) {
            throw new InvalidFlightException(
                "The passenger count " + passengerCount +
                " is invalid for " + flightName
            );
        }
        return true;
    }

    public double calculateFuelToFillTank(String flightName,double currentFuelLevel) throws InvalidFlightException {

        Map<String, Double> fuelCapacityMap = new HashMap<>();
        fuelCapacityMap.put("SpiceJet", 200000.0);
        fuelCapacityMap.put("Vistara", 300000.0);
        fuelCapacityMap.put("IndiGo", 250000.0);
        fuelCapacityMap.put("Air Arabia", 150000.0);

        double maxFuel = fuelCapacityMap.get(flightName);

        if (currentFuelLevel < 0 || currentFuelLevel > maxFuel) {
            throw new InvalidFlightException(
                "Invalid fuel level for " + flightName
            );
        }

        return maxFuel - currentFuelLevel;
    }
}
