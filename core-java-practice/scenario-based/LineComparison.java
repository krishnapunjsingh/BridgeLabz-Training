
import java.util.Scanner;

public class LineComparison {
    //UC1 calculate length
    public static Double calculateLength(double x1, double y1, double x2, double y2){
        double length = (double)Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return length;
    }
    //UC2 Check equals
    public static boolean checkEquals(Double Line1Length , Double Line2Length ){
        return Line1Length.equals(Line2Length);
    }
    //UC3 Compare Lines
    public static void compareLines(Double Line1Length, Double Line2Length){
        if(Line1Length.compareTo(Line2Length) > 0){
            System.out.println("Line 1 is greater than Line 2");
        }
        else if(Line1Length.compareTo(Line2Length)<0){
            System.out.println("Line 2 is greater than Line 1");
        }
        else{
            System.out.println("Both lines are equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1,y1 for line 1:");
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        System.out.println("enter x2,y2 for line 1:");
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();


        System.out.println("enter x3, y3 for line 2:");
        double x3 = sc.nextInt();
        double y3 = sc.nextInt();
        System.out.println("enter x4, y4 for line 2:");
        double x4 = sc.nextInt();
        double y4 = sc.nextInt();

        Double length1 = calculateLength(x1, y1, x2, y2);
        System.out.println("Length of line 1 is: " + length1);
        Double length2 = calculateLength(x3, y3, x4, y4);
        System.out.println("Length of line 2 is: " + length2);
        boolean isEqual = checkEquals(length1, length2);
        if(isEqual){
            System.out.println("Both lines are equal");
            return;
        }
        compareLines(length1, length2);
    }
}
