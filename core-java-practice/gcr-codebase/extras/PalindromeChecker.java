import java.util.Scanner;

class PalindromeChecker {

    static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    static boolean isPalindrome(String str) {

        str = str.toLowerCase().replace(" ", "");

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println( str + " is a Palindrome");
        } else {
            System.out.println( str + " is NOT a Palindrome");
        }
    }

    public static void main(String[] args) {

        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}
