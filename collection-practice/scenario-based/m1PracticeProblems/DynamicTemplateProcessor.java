import java.util.*;
import java.util.regex.*;
import java.time.*;
import java.time.format.*;

public class DynamicTemplateProcessor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String line = sc.nextLine();
            System.out.println(process(line));
        }
    }

    static String process(String line) {
        Pattern pattern = Pattern.compile("\\$\\{([^:}]+):([^}]+)\\}");
        Matcher matcher = pattern.matcher(line);

        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String type = matcher.group(1);
            String value = matcher.group(2);

            String replacement = handle(type, value);
            matcher.appendReplacement(result, replacement);
        }

        matcher.appendTail(result);
        return result.toString();
    }

    static String handle(String type, String value) {

        try {
            switch (type) {

                case "UPPER":
                    return value.toUpperCase();

                case "LOWER":
                    return value.toLowerCase();

                case "REPEAT":
                    String[] parts = value.split(",");
                    if (parts.length != 2) return "INVALID";

                    String word = parts[0];
                    int count = Integer.parseInt(parts[1]);

                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < count; i++) {
                        sb.append(word);
                    }
                    return sb.toString();

                case "DATE":
                    DateTimeFormatter input = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    DateTimeFormatter output = DateTimeFormatter.ofPattern("yyyy/MM/dd");

                    LocalDate date = LocalDate.parse(value, input);
                    return date.format(output);

                default:
                    return "INVALID";
            }
        } catch (Exception e) {
            return "INVALID";
        }
    }
}