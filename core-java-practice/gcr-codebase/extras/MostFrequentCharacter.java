import java.util.Scanner;

class MostFrequentCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256]; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        char mostFrequent = str.charAt(0);
        int maxCount = freq[mostFrequent];

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequent = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
