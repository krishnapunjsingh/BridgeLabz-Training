import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMIStatus(double weight, double heightCm) {

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;

        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal";
        else if (bmi < 30)
            status = "Overweight";
        else
            status = "Obese";

        return new String[] { bmi + "", status };
    }

    public static String[][] processBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            String[] bmiData = calculateBMIStatus(data[i][0], data[i][1]);

            result[i][0] = data[i][1] + "";
            result[i][1] = data[i][0] + "";
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }

        return result;
    }

    public static void displayTable(String[][] arr) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(
                arr[i][0] + "\t\t" +
                arr[i][1] + "\t\t" +
                arr[i][2] + "\t" +
                arr[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = processBMI(data);
        displayTable(result);

    }
}
