import java.util.Scanner;
import java.util.LinkedHashSet;

public class LexicalTwist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        String check = new StringBuilder(word1).reverse().toString();

        if (word2.equals(check)) {

            System.out.println("word1 and word2 are reverse of each other");

            String reverseWord1 = new StringBuilder(word1).reverse().toString();
            String reverseWord1Lower = reverseWord1.toLowerCase();
            StringBuilder result = new StringBuilder();

            int vowelCount = 0;

            for (char ch : reverseWord1Lower.toCharArray()) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                    result.append('@');
                } else {
                    result.append(ch);
                }
            }

            System.out.println(result.toString());

        } else {

            System.out.println("reverse of word2 is not equal to word1");

            String concatenated = word1 + word2;
            String concatenatedUpper = concatenated.toUpperCase();

            int countVowels = 0;
            int countConsonants = 0;

            // Count vowels and consonants
            for (char ch : concatenatedUpper.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        countVowels++;
                    } else {
                        countConsonants++;
                    }
                }
            }

            // Logic after counting
            if (countConsonants > countVowels) {

                LinkedHashSet<Character> consonantSet = new LinkedHashSet<>();

                for (char ch : concatenatedUpper.toCharArray()) {
                    if (ch >= 'A' && ch <= 'Z' &&
                        ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                        consonantSet.add(ch);
                    }
                    if (consonantSet.size() == 2)
                        break;
                }

                for (char c : consonantSet) {
                    System.out.print(c + " ");
                }

            } else if (countVowels > countConsonants) {

                LinkedHashSet<Character> vowelSet = new LinkedHashSet<>();

                for (char ch : concatenatedUpper.toCharArray()) {
                    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        vowelSet.add(ch);
                    }
                    if (vowelSet.size() == 2)
                        break;
                }

                for (char v : vowelSet) {
                    System.out.print(v + " ");
                }

            } else {
                System.out.println("vowels and consonants are equal");
            }
        }

    }
}
