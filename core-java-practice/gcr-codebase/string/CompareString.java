import java.util.Scanner;
public class CompareString {
    public static boolean compareUsingCharAt(String s1, String s2){
        if(s1.length() != s2.length()){
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
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        boolean charAtResult = CompareUsingCharAt(s1, s2);
        boolean equalsResult = s1.equals(s2);

        if(charAtResult == equalsResult){
            System.out.print("by both method result are same, which is " + CompareUsingCharAt(s1,s2));
        }
        else{
            System.out.println("by both method result are not same ");
        }
    }
}
