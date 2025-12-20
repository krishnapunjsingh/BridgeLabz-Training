
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        String op = scanner.next();
        
        double result = 0;
        boolean validOperator = true;
        
        switch(op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if(second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Cannot divide by zero");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                validOperator = false;
        }
        
        if(validOperator) {
            System.out.println("Result: " + result);
        }
        
    }
}
