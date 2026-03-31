import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergeCSV {

    public static void main(String[] args) {

        String file1 = "student1.csv";
        String file2 = "student2.csv";
        String outputFile = "students_merged.csv";

        // Map to store first CSV data with ID as key
        Map<String, String[]> map = new HashMap<>();

        try (BufferedReader br1 = new BufferedReader(new FileReader(file1))) {

            String line;
            br1.readLine(); // skip header

            while ((line = br1.readLine()) != null) {
                String[] data = line.split(",");
                map.put(data[0], new String[]{data[1], data[2]}); // ID -> {Name, Age}
            }

        } catch (IOException e) {
            System.out.println("Error reading file1: " + e.getMessage());
            return;
        }

        try (BufferedReader br2 = new BufferedReader(new FileReader(file2));
             FileWriter writer = new FileWriter(outputFile)) {

            String line;
            String header1 = "ID,Name,Age,Marks,Grade\n";
            writer.write(header1);

            br2.readLine(); // skip header

            while ((line = br2.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                String marks = data[1];
                String grade = data[2];

                if (map.containsKey(id)) {
                    String[] student1Data = map.get(id);
                    writer.write(id + "," + student1Data[0] + "," + student1Data[1] + "," + marks + "," + grade + "\n");
                }
            }

            System.out.println("CSV files merged successfully! Output: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error reading file2 or writing output: " + e.getMessage());
        }
    }
}
