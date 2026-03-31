import java.util.Scanner;
public class SideOfSquare {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Perimeter = sc.nextDouble();
        double side = Perimeter / 4;
        System.out.println("The Length of a side is "+ side + " whose perimeter is " + Perimeter);
    }
}