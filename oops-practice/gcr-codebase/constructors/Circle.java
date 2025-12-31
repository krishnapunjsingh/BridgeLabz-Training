
import java.util.Scanner;

public class Circle {
    int radius;
    Circle() {
        this(5);
        System.out.println("Default Constructor Called");
    }
    Circle(int r) {
        this.radius = r;
    }
    void display(){
        System.out.println("Radius of the circle " + radius);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle ");
        int r = sc.nextInt();
        Circle c1 = new Circle();
        Circle c2 = new Circle(r);
        c1.display();
        c2.display();    
    }
    
}
