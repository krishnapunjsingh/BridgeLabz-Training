
import java.util.Scanner;

public class FlipKey {
    public static String cleanseAndInvert(String input){
        if( input == null || input.length() < 6 ) {
            return "";
        }      
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if (!Character.isLetter(ch)) {
                return "";
            }

        }
        String inputLower = input.toLowerCase();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<inputLower.length();i++){
            char ch = inputLower.charAt(i);
            if(ch % 2 != 0){
                result.append(ch);
            }        
        }
        String reverseResult = result.reverse().toString();
        StringBuilder finalresult = new StringBuilder();
        for(int i=0;i<reverseResult.length();i++){
            char ch = reverseResult.charAt(i);
            if(i%2 == 0){
                finalresult.append(Character.toUpperCase(ch));
            } else {
                finalresult.append(ch);
            }
        }
        return finalresult.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = cleanseAndInvert(input);
        if (output.equals("")) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + output);
        }
    }
}
