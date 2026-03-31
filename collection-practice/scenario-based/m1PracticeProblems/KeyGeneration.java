import java.util.*;

public class KeyGeneration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String str = sc.nextLine();

            String result = process(str);
            System.out.println(result);
        }
    }

    static String process(String str) {

        // 1. Empty
        if (str.length() == 0)
            return "Invalid Input (empty string)";

        // 2. Length check
        if (str.length() < 6)
            return "Invalid Input (length < 6)";

        // 3. Space check
        if (str.contains(" "))
            return "Invalid Input (contains space)";

        // 4. Digit check
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c))
                return "Invalid Input (contains digits)";
        }

        // 5. Special character check
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c))
                return "Invalid Input (contains special character)";
        }

        // Key Generation
        // Step 1: lowercase
        str = str.toLowerCase();

        // Step 2: remove even ASCII
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ((int) c % 2 != 0) {
                sb.append(c);
            }
        }

        // Step 3: reverse
        sb.reverse();

        // Step 4: uppercase even index
        for (int i = 0; i < sb.length(); i++) {
            if (i % 2 == 0) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }

        return "The generated key is - " + sb.toString();
    }
}