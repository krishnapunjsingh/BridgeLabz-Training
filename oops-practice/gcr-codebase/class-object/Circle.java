public class Circle {
    double radius;
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    void display(){
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 2.5;
        circle.display();
    }
}
