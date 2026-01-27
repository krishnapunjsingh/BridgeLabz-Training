
import java.util.Scanner;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
    
}
class AgeValidator{
    static void validateAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
}
public class CustomException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the age");
            int n = sc.nextInt();
            AgeValidator.validateAge(n);
             System.out.println("Access granted!");

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
