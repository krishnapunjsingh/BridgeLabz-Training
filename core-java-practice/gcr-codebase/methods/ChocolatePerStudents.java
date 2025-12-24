
import java.util.Scanner;

public class ChocolatePerStudents {
    public static int[] calculate(int chocolate, int students){
        int chocolateToEach = chocolate/students;
        int remainingChocolates = chocolate%students;
        return new int[]{chocolateToEach, remainingChocolates};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfChocolate = sc.nextInt();
        int numberOfStudents = sc.nextInt();
        int [] arr = calculate(numberOfChocolate, numberOfStudents);
        System.out.print("The chocolate per Student is "+ arr[0] + " The remaining Chocolate is "+ arr[1]); 

    }
}
