import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeCSVReader {

    public static void main(String[] args) {

        String filePath = "large_student.csv"; // Path to your large CSV file
        int chunkSize = 100; // Number of lines to process at a time
        int totalRecords = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            int chunkCount = 0;

            // Skip header
            br.readLine();

            while (true) {
                int linesRead = 0;

                // Read 100 lines at a time
                while (linesRead < chunkSize && (line = br.readLine()) != null) {
                    linesRead++;
                    totalRecords++;
                    // Process the line here if needed (e.g., parse, validate, etc.)
                }

                if (linesRead == 0) {
                    // End of file reached
                    break;
                }

                chunkCount++;
                System.out.println("Processed chunk #" + chunkCount + " (" + linesRead + " records)");
            }

            System.out.println("Total records processed: " + totalRecords);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
