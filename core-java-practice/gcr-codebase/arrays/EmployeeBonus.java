
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double [] salary = new double[n];
        double [] yearOfService = new double[n];
        double [] bonus = new double[n];
        double [] newSalary = new double[n];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for(int i=0;i<n;i++){
            System.out.println("Enter the Salary and year of service of employee " + (i+1));
            double sal = sc.nextDouble();
            double year = sc.nextDouble();

            if(sal <= 0 || year<=0){
                System.out.print("Invalid Input..., please enter again");
                i--;
                continue;

            }
            salary[i] = sal;
            yearOfService[i] = year;
            totalOldSalary += sal;
        }
        for(int i=0;i<n;i++){
            if(yearOfService[i] > 5){
                bonus[i] = salary[i]*0.05;
            }
            else{
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total Old Salary " + totalOldSalary);
        System.out.println("Total Bonus Payout " + totalBonus);
        System.out.println("Total New Salary " + totalNewSalary);


    }
}
