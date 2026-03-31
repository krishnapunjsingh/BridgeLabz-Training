interface UnitConverter {

    // Kilometers to Miles
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    // Miles to Kilometers
    static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    // Kilograms to Pounds
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

    // Pounds to Kilograms
    static double lbsToKg(double lbs) {
        return lbs * 0.453592;
    }
}
public class LogisticsApp {

    public static void main(String[] args) {

        double distanceKm = 120;
        double weightKg = 50;

        System.out.println(distanceKm + " km = " + UnitConverter.kmToMiles(distanceKm) + " miles");

        System.out.println(weightKg + " kg = " + UnitConverter.kgToLbs(weightKg) + " lbs");
    }
}
