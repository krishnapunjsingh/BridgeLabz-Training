import java.util.Random;

public class BonusOfEmployees {

    public static double[][] generateSalaryAndService(int employees) {
        double[][] data = new double[employees][2];
        Random rand = new Random();

        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary
            data[i][1] = 1 + rand.nextInt(10);        // years of service (1–10)
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] oldData) {
        double[][] newData = new double[oldData.length][2];

        for (int i = 0; i < oldData.length; i++) {
            double salary = oldData[i][0];
            double years = oldData[i][1];
            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            newData[i][0] = salary + bonus; // new salary
            newData[i][1] = bonus;          // bonus amount
        }
        return newData;
    }

    public static void calculateAndDisplayTotals(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");

        for (int i = 0; i < oldData.length; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];

            System.out.printf("%d\t%.0f\t\t%.0f\t%.0f\t\t%.0f%n",
                    (i + 1),
                    oldData[i][0],
                    oldData[i][1],
                    newData[i][1],
                    newData[i][0]);
        }

        System.out.println("Total Old Salary  " + totalOldSalary);
        System.out.println("Total Bonus Paid  " + totalBonus);
        System.out.println("Total New Salary  " + totalNewSalary);
    }

    public static void main(String[] args) {
        int employees = 10;
        double[][] oldSalaryData = generateSalaryAndService(employees);
        double[][] newSalaryData = calculateNewSalaryAndBonus(oldSalaryData);
        calculateAndDisplayTotals(oldSalaryData, newSalaryData);
    }
}
