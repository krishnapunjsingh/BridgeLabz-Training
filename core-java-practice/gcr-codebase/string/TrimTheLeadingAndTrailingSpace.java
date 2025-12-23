
import java.util.Scanner;

public class TrimTheLeadingAndTrailingSpace {

    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }  
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String createSubString(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int [] indexs = findTrimIndexes(str);
        String trim = createSubString(str, indexs[0], indexs[1]);// index 0-> for starting (trim) spaces and 1-> for end (trim) spaces (start,end )->create a substring that is trimmed
        String builtInTrim = str.trim();

        boolean isSame = compareString(trim, builtInTrim);
        System.out.println("Custom trim string " + trim);
        System.out.println("Built-In Trimmed Stream " + builtInTrim);
        System.out.println("Are both equal " + isSame);
    }
}
