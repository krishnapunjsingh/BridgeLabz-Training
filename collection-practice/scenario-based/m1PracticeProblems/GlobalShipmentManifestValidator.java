import java.util.*;
import java.time.*;
import java.time.format.*;

public class GlobalShipmentManifestValidator {

    static Set<String> validModes = new HashSet<>(Arrays.asList(
            "AIR", "SEA", "ROAD", "RAIL", "EXPRESS", "FREIGHT"
    ));

    static Set<String> validStatus = new HashSet<>(Arrays.asList(
            "DELIVERED", "CANCELLED", "IN_TRANSIT"
    ));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String record = sc.nextLine();
            if (isValid(record)) {
                System.out.println("COMPLIANT RECORD");
            } else {
                System.out.println("NON-COMPLIANT RECORD");
            }
        }
    }

    static boolean isValid(String record) {
        String[] parts = record.split("\\|");
        if (parts.length != 5) return false;

        return isValidCode(parts[0]) &&
               isValidDate(parts[1]) &&
               isValidMode(parts[2]) &&
               isValidWeight(parts[3]) &&
               isValidStatus(parts[4]);
    }

    static boolean isValidCode(String code) {
        if (!code.matches("SHIP-[1-9][0-9]{5}")) return false;

        String digits = code.substring(5);

        int count = 1;
        for (int i = 1; i < digits.length(); i++) {
            if (digits.charAt(i) == digits.charAt(i - 1)) {
                count++;
                if (count > 3) return false;
            } else {
                count = 1;
            }
        }
        return true;
    }

    static boolean isValidDate(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate d = LocalDate.parse(date, formatter);

            int year = d.getYear();
            return year >= 2000 && year <= 2099;
        } catch (Exception e) {
            return false;
        }
    }

    static boolean isValidMode(String mode) {
        return validModes.contains(mode);
    }

    static boolean isValidWeight(String weight) {
        if (!weight.matches("(0|[1-9][0-9]{0,5})(\\.[0-9]{1,2})?")) return false;

        try {
            double val = Double.parseDouble(weight);
            return val > 0 && val <= 999999.99;
        } catch (Exception e) {
            return false;
        }
    }

    static boolean isValidStatus(String status) {
        return validStatus.contains(status);
    }
}