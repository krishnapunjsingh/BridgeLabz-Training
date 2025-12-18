import java.util.Scanner;
public class BasicCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double division = number1 / number2;
        System.out.print(" The addition, subtraction, multiplication and division value of 2 numbers " + sum +  " , " + difference +  " , " + product +  " and " + division);
    }
}
