
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        while (true) { 
            System.out.println("Enter the weight in kg ");
            double weight = sc.nextDouble();

            System.out.println("Enter the height in cm ");
            double height = sc.nextDouble();

            double heightInMeter = height/100;
            if(height <= 0 || weight <= 0){
                System.out.println("Invalid input..., please Try Again...");
                continue;
            }
            double bmi = weight/(heightInMeter * heightInMeter);
            if (bmi < 18.5) {
                System.out.println("Category: Underweight");
            } else if (bmi >= 18.5 && bmi < 25) {
                System.out.println("Category: Normal");
            } else {
                System.out.println("Category: Overweight");
            }
            System.out.println("Do you want to calculate the bmi for others...!, (y/n)");
            choice = sc.next().charAt(0);
            if(choice == 'n' || choice == 'N'){
                break;
            }
            

        }
    }
}
