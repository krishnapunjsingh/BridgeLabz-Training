
import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year < 1582){
            System.out.println("Enter a valid year");
        }
        else if(year % 400 == 0){
            System.out.println("It is a Leap Year");
        }
        else if(year % 100 == 0){
            System.out.println("It is not a Leap Year");
        }
        else if(year % 4 == 0){
            System.out.println("It is a Leap Year");
        }
        else {
            System.out.print("It is not a Leap Year");
        }
    }
}
