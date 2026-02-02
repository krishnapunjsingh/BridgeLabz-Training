import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSV {

    public static void main(String[] args) {

        String filePath = "contacts.csv";

        // Regex patterns
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Pattern phonePattern = Pattern.compile("^\\d{10}$");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            int row = 0;

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                row++;
                String[] data = line.split(",");

                String email = data[2].trim();
                String phone = data[3].trim();

                boolean valid = true;

                if (!emailPattern.matcher(email).matches()) {
                    System.out.println("Row " + row + " Invalid Email: " + email);
                    valid = false;
                }

                if (!phonePattern.matcher(phone).matches()) {
                    System.out.println("Row " + row + " Invalid Phone: " + phone);
                    valid = false;
                }

                if (valid) {
                    System.out.println("Row " + row + " is valid.");
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
