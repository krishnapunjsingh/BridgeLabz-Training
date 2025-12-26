
import java.util.Scanner;

public class LongestWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String longest = "";
        for(int i=0;i<words.length;i++){
            if(words[i].length() > longest.length()){
                longest = words[i];
            }
        }
        System.out.print(longest);
    }
}
