import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateCSV {

    public static void main(String[] args) {

        String inputFile = "employees.csv";
        String outputFile = "employees_updated.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {

            String line;

            // Read header and write to new file
            if ((line = br.readLine()) != null) {
                writer.write(line + "\n");
            }

            // Process remaining lines
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                String id = data[0];
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                // Increase salary by 10% if department is IT
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary * 1.10;
                }

                // Write updated line
                writer.write(id + "," + name + "," + department + "," + (int)salary + "\n");
            }

            System.out.println("CSV file updated successfully! Saved as: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
