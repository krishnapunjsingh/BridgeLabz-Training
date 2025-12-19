import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int yearOfService = sc.nextInt();
        if(yearOfService > 5){
            double bonus = salary * 0.05;
            System.out.println("The bonus is: " + bonus);
        } else {
            System.out.println("bonus amount is 0");
        }
    }
}
