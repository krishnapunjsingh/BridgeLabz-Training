
import java.util.Scanner;

public class NullPointer {
    public static void generateException(){
        String str = null;
        System.out.println(str.length());
    }
    public static void handleException(){
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception " + e);
        }
        handleException();
    }

}
