
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromAStringUsingStringBuilder {
    public static String removeDuplicates(String str){
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reverse = removeDuplicates(input);
        System.out.println("After removing duplicates: " + reverse);

    }
}
