
import java.util.Scanner;

public class StringIndexOutOfBound {
    public static void generateException(String text ){
        System.out.println(text.charAt(text.length()));
    }
    public static void handleException(String text){
        try {
            System.out.println(text.charAt(text.length()));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception "+ e);
        }
        handleException(text);
    }
}
