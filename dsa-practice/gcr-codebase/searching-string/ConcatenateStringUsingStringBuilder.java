
import java.util.Scanner;

public class ConcatenateStringUsingStringBuilder {
    public static String concatenateString(String[] str){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length;i++){
            sb.append(str[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        String [] str = new String[n];
        for(int i=0;i<n;i++){
            str[i] = sc.nextLine();
        }
        String answer = concatenateString(str);
        System.out.println("String is " + answer);

    }
}
