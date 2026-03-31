import java.util.*;

public class IoTSensorReadings {

    public static void main(String[] args) {

        List<Double> sensorReadings = Arrays.asList(
                22.5,
                28.0,
                31.2,
                19.8,
                35.6
        );

        double threshold = 25.0;

        // Print readings above threshold
        sensorReadings.stream()
                      .filter(reading -> reading > threshold)
                      .forEach(reading ->
                              System.out.println("High Reading: " + reading)
                      );
    }
}
