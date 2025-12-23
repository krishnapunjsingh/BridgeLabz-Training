import java.util.Scanner;

public class ShortestAndLongest {

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

        int[] spaceIndex = new int[wordCount - 1];
        int idx = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = "";
            for (int j = start; j < spaceIndex[i]; j++) {
                words[i] += text.charAt(j);
            }
            start = spaceIndex[i] + 1;
        }

        words[wordCount - 1] = "";
        for (int i = start; i < length; i++) {
            words[wordCount - 1] += text.charAt(i);
        }

        return words;
    }

    public static String[][] wordWithLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static int[] findShortestAndLongest(String[][] data) {

        int shortest = Integer.parseInt(data[0][1]);
        int longest = Integer.parseInt(data[0][1]);

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);

            if (len < shortest) {
                shortest = len;
            }
            if (len > longest) {
                longest = len;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitUsingCharAt(text);

        String[][] wordLengthData = wordWithLength(words);

        int[] result = findShortestAndLongest(wordLengthData);

        System.out.println("Shortest word length: " + result[0]);
        System.out.println("Longest word length: " + result[1]);

        sc.close();
    }
}
