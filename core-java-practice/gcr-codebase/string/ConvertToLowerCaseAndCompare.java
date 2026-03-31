import java.util.Scanner;
public class ConvertToLowerCaseAndCompare {
    public static String changeCase(String text){
        String result = "";
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch >= 'A' && ch <='Z'){
                ch = (char)(ch+32);
            }
            result += ch;
        }
        return result;

    }
    public static boolean compareStrings(String s1, String s2){
        if (s1.length()!=s2.length()){
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
        String userDef = changeCase(text);
        String builtIn = text.toLowerCase();

        boolean istrue = compareStrings(userDef, builtIn);
        System.out.println("UserDefined UpperCase " + userDef);
        System.out.println("Built-in UpperCase " + builtIn);
        System.out.println("Are both equal " + istrue);
        
    }
}
