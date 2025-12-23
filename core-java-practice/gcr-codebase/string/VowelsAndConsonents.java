
import java.util.Scanner;

public class VowelsAndConsonents {
    public static String checkChar(char ch){
        if(ch >= 'a' && ch <='z'){
            if(ch == 'a' || ch =='e' || ch == 'i' || ch== 'o' || ch == 'u'){
                return "vowel";
            }
            else{
                return "consonent";
            }
            
        }
        return "";
    }
    public static int[] checkVowelConsonent(String str){
        int vowels = 0;
        int consonents = 0;
        for(int i=0;i<str.length();i++){
            String result = checkChar(str.charAt(i));
            if(result.equals("vowel")){
                vowels++;
            }
            else if(result.equals("consonent")){
                consonents++;
            }
        }
        return new int[]{vowels,consonents};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int [] result = checkVowelConsonent(str);
        System.out.println("Vowels " + result[0]);
        System.out.println("Consonents " + result[1]);
        
    }
}
