import java.util.Scanner;

public class FrequencyUsingUnique {

    public static char[] uniqueCharacters(String text) {

        int len = text.length();
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index++] = ch;
            }
        }

        char[] unique = new char[index];
        for (int i = 0; i < index; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    public static String[][] findFrequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = unique[i] + "";
            result[i][1] = freq[unique[i]] + "";
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);

        System.out.println("\nCharacter\tFrequency");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }
}
