
import java.util.Scanner;

public class ConvertToUpperCaseAndCompare {
    public static String changeCase(String text){
        String result = "";
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char) (ch-32);
            }
            result += ch;
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String userUpper = changeCase(text);
        String builtIn = text.toUpperCase();

        boolean result = compareStrings(builtIn, userUpper);

        System.out.println("User Defined UpperCase " + userUpper);
        System.out.println("Built In UpperCase " + builtIn);
        System.out.println("Are both equal " + result);

    }
}
