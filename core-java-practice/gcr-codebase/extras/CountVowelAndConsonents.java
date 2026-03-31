
import java.util.Scanner;

public class CountVowelAndConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int countVowels = 0;
        int countConsonents = 0;
        String temp = text.toLowerCase();
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch >= 'a' && ch <='z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){          
                    countVowels++;    
                }
                else{
                    countConsonents++;
                }
            }
            
        }
        System.out.println("Total vowels are " + countVowels);
        System.out.println("Total consonents are " + countConsonents);
    }
}
