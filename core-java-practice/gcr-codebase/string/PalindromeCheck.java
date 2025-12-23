import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeLogic2(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    public static char[] reverseString(String text) {

        int len = text.length();
        char[] rev = new char[len];
        int index = 0;

        for (int i = len - 1; i >= 0; i--) {
            rev[index++] = text.charAt(i);
        }

        return rev;
    }

    public static boolean isPalindromeLogic3(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        boolean result1 = isPalindromeLogic1(input);
        boolean result2 = isPalindromeLogic2(input, 0, input.length() - 1);
        boolean result3 = isPalindromeLogic3(input);

        System.out.println("\nPalindrome Check Results");
        System.out.println("Logic 1 (Loop)      : " + result1);
        System.out.println("Logic 2 (Recursion) : " + result2);
        System.out.println("Logic 3 (Array)     : " + result3);

    }
}
