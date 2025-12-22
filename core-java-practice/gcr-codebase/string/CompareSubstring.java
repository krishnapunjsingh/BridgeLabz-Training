
import java.util.Scanner;

public class CompareSubstring {
    public static String createSubstring(String str, int start,int end){
        String result = "";
        for(int i=start;i<end;i++){
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean compareString(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();             
        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();
        
        String charAtSubstring = createSubstring(str, startIndex, endIndex);
        String builtInSubstring = str.substring(startIndex,endIndex);
        boolean result = compareString(charAtSubstring, builtInSubstring);

        System.out.println("Substring using charAt " + charAtSubstring);
        System.out.println("Substring using builIn " + builtInSubstring);
        System.out.println("Are both equals " + result);
        

    }
}
