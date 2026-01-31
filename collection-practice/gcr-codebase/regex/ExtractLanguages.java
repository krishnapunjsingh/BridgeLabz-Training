import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLanguages {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String regex = "\\b(Java|Python|JavaScript|Go)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Programming Languages found:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
