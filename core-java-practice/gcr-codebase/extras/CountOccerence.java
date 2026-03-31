
import java.util.Scanner;

public class CountOccerence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.next();
        int count = 0;
        for(int i=0;i<=str.length() - word.length();i++){
            String current = str.substring(i, i+word.length());
            if(current.equals(word)){
                count++;
            }
        }
        System.out.println("Total substring in this sentence is " + count);
    }
}
