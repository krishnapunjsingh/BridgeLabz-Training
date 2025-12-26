import java.util.Scanner;

class AnagramChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are NOT anagrams");
            return;
        }

        int[] freq = new int[256]; // ASCII characters

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println("Strings are NOT anagrams");
                return;
            }
        }

        System.out.println("Strings are anagrams");
    }
}
