import java.util.Scanner;
public class LengthOfString {
    public static int findLength(String str){
        int count = 0;
        try {
            while(true){
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int userDefinedLength = findLength(str);
        int builtInLength = str.length();

        System.out.println("UserDefined Length " + userDefinedLength);
        System.out.println("Built-In Length " + builtInLength);

    }
}
