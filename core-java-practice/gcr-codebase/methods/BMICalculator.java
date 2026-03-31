import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.5) {
                status[i] = "Underweight";
            } else if (bmi>=18.5 && bmi <= 25) {
                status[i] = "Normal";
            } else if (bmi>=25 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][3];

        for (int i = 0; i < persons.length; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);
        String[] status = getBMIStatus(persons);

        System.out.println("\nWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < persons.length; i++) {
            System.out.printf("%.1f\t%.1f\t%.2f\t%s%n",
                    persons[i][0], persons[i][1], persons[i][2], status[i]);
        }

    }
}
