import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {

    public static void main(String[] args) {

        String filePath = "employees.csv";

        try (FileWriter writer = new FileWriter(filePath)) {

            // Write header
            writer.append("ID,Name,Department,Salary\n");

            // Write records
            writer.append("101,Krishnam,IT,75000\n");
            writer.append("102,Amit,HR,60000\n");
            writer.append("103,Riya,Finance,80000\n");
            writer.append("104,Sneha,Marketing,65000\n");
            writer.append("105,Rahul,Operations,70000\n");

            System.out.println("CSV file written successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
