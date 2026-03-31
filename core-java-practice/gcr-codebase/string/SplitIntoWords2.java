import java.util.Scanner;

public class SplitIntoWords2 {

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
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        words[index] = "";

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                index++;
                words[index] = "";
            } else {
                words[index] += text.charAt(i);
            }
        }

        return words;
    }

    public static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitUsingCharAt(text);
        String[][] result = createWordLengthTable(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < result.length; i++) {
            int len = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t" + len);
        }
    }
}
