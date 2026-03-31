import java.util.Scanner;

public class CensorBadWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence = sc.nextLine();

        String regex = "\\b(damn|stupid)\\b";

        String censored = sentence.replaceAll("(?i)" + regex, "****");

        System.out.println("Censored Output:");
        System.out.println(censored);

        sc.close();
    }
}
