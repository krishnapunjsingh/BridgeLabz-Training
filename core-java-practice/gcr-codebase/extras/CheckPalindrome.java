
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        if(reverse.equals(str)){
            System.out.println("it is palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
