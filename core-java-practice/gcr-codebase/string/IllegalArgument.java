import java.util.Scanner;
public class IllegalArgument {
    public static void createException(String str){
        System.out.print(str.substring(4 , 2));
    }
    public static void handleException(String str){
        try {
            System.out.println(str.substring(4, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        try {
            createException(input);
        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
        handleException(input);
    }
}
