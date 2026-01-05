public class TemperatureAnalyzer {

    // Method to find hottest and coldest day
    static void findHottestAndColdestDay(float[][] temp) {
        float max = temp[0][0];
        float min = temp[0][0];
        int hottestDay = 0;
        int coldestDay = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                if (temp[i][j] > max) {
                    max = temp[i][j];
                    hottestDay = i;
                }
                if (temp[i][j] < min) {
                    min = temp[i][j];
                    coldestDay = i;
                }
            }
        }

        System.out.println("Hottest Day: Day " + (hottestDay + 1));
        System.out.println("Coldest Day: Day " + (coldestDay + 1));
    }

    // Method to return average temperature per day
    static float[] averageTemperaturePerDay(float[][] temp) {
        float[] avg = new float[7];

        for (int i = 0; i < 7; i++) {
            float sum = 0;
            for (int j = 0; j < 24; j++) {
                sum += temp[i][j];
            }
            avg[i] = sum / 24;
        }
        return avg;
    }

    // Main method (testing)
    public static void main(String[] args) {

        float[][] temperature = new float[7][24];

        // Sample data
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                temperature[i][j] = (float) (Math.random() * 40);
            }
        }

        findHottestAndColdestDay(temperature);

        float[] averages = averageTemperaturePerDay(temperature);

        System.out.println("Average Temperature Per Day:");
        for (int i = 0; i < averages.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + averages[i]);
        }
    }
}
