
import java.util.Scanner;

public class Username{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of usernames:");
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        String username = sc.nextLine();
        if(username.matches(regex)){
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
        
    }
}