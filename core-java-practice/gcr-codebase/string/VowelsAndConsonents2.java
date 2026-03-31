import java.util.Scanner;
public class VowelsAndConsonents2 {
    public static String checkCharType(char ch){
        if(ch >= 65 && ch <= 90){
            ch = (char) (ch+32);
        }
        if(ch >= 97 && ch <= 122){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";

    }
    public static String[][] findVowelsAndConsonants(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }

        return result;
    }
    public static void displayTable(String[][] arr) {

        System.out.println("\nCharacter\tType");
        

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = findVowelsAndConsonants(text);
        displayTable(result);
    }
}

