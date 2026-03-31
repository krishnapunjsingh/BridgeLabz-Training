
import java.util.Scanner;


public class ReturnAllChar {
    public static char[] returnChar(String str){
        char [] arr = new char[str.length()];
        for(int i=0;i<arr.length;i++){
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    public static boolean compareCharArray(char [] arr1, char [] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        
        char [] userDef = returnChar(string1);
        char [] builtIn = string1.toCharArray();
        
        boolean result = compareCharArray(userDef, builtIn);

        System.out.println("Are both equal " + result);
        
    }
}
