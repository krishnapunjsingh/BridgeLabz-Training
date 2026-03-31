import java.util.*;

public class CorporateEmailAccessControl {

    static Set<String> validDept = new HashSet<>(Arrays.asList(
            "sales", "marketing", "IT", "product"
    ));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String email = sc.nextLine();

            if (isValid(email)) {
                System.out.println("Access Granted");
            } else {
                System.out.println("Access Denied");
            }
        }
    }

    static boolean isValid(String email) {
        if (email.contains(" ")) return false;
        try {
            String[] parts = email.split("@");
            if (parts.length != 2) return false;

            String local = parts[0];
            String domainPart = parts[1];

            if (!domainPart.endsWith(".company.com")) return false;

            String dept = domainPart.substring(0, domainPart.indexOf(".company.com"));
            if (!validDept.contains(dept)) return false;

            String[] nameParts = local.split("\\.");
            if (nameParts.length != 2) return false;

            String first = nameParts[0];
            String[] lastDigits = nameParts[1].split("\\+");

            if (lastDigits.length != 2) return false;

            String last = lastDigits[0];
            String digits = lastDigits[1];

            if (first.length() < 3 || last.length() < 3) return false;
            if (!first.matches("[a-z]+") || !last.matches("[a-z]+")) return false;

            if (!digits.matches("[0-9]{4,}")) return false;

            return true;

        } catch (Exception e) {
            return false;
        }
    }
}