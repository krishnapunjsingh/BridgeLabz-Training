import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicatesCSV {

    public static void main(String[] args) {

        String filePath = "students_duplicates.csv";
        Set<String> uniqueIDs = new HashSet<>();
        Set<String> duplicateIDs = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];

                if (!uniqueIDs.add(id)) {
                    // ID already exists → duplicate
                    duplicateIDs.add(id);
                    System.out.println("Duplicate record found: " + line);
                }
            }

            if (duplicateIDs.isEmpty()) {
                System.out.println("No duplicates found.");
            } else {
                System.out.println("Total duplicate IDs: " + duplicateIDs.size());
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
