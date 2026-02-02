import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseToCSV {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/your_database";
        String username = "root";
        String password = "password";
        String csvFile = "employees_report.csv";

        String sql = "SELECT id, name, department, salary FROM employees";

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
             FileWriter writer = new FileWriter(csvFile)) {

            // Write header
            writer.append("Employee ID,Name,Department,Salary\n");

            // Write rows
            while (rs.next()) {
                writer.append(rs.getInt("id") + ",");
                writer.append(rs.getString("name") + ",");
                writer.append(rs.getString("department") + ",");
                writer.append(rs.getDouble("salary") + "\n");
            }

            System.out.println("CSV report generated successfully: " + csvFile);

        } catch (SQLException | IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
