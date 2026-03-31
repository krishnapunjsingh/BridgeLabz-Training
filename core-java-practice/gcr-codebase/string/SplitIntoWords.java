import java.util.Scanner;

public class SplitIntoWords {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitUsingCharAt(String text) {

        int length = findLength(text);

        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String current = "";

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                current += text.charAt(i);
            } else if (!current.equals("")) {
                words[index++] = current;
                current = "";
            }
        }

        if (!current.equals("")) {
            words[index] = current;
        }

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] userDef = splitUsingCharAt(text);
        String[] builtIn = text.split("\\s+");

        boolean result = compareArrays(userDef, builtIn);

        System.out.println("Are both results equal " + result);
    }
}
