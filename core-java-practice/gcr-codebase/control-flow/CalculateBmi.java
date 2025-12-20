
import java.util.Scanner;

public class CalculateBmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kg ");
        double weight = sc.nextDouble();
        System.out.println("Enter height in cm ");
        double height = sc.nextDouble();
        double heightInMeters = height/100;
        double bmi = weight / (heightInMeters * heightInMeters);
        if(bmi <= 18.4){
            System.out.print("Underweight");
        }
        else if( bmi >= 18.5 && bmi <=24.9 ){
            System.out.print("Normal weight");
        }
        else if(bmi >= 25 && bmi <= 39.9){
            System.out.print("Overweight");
        }
        else{
            System.out.print("Obese");
        }
    }
}
