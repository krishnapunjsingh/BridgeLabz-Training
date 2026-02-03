package JSON.json_demo;
package JSON.json_demo;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;


import java.sql.*;

public class DatabaseToJsonReport {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            // SQL query to fetch data
            String query = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            ObjectMapper mapper = new ObjectMapper();
            ArrayNode jsonArray = mapper.createArrayNode();

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                ObjectNode record = mapper.createObjectNode();

                // Dynamically add all columns
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnLabel(i);
                    int columnType = metaData.getColumnType(i);

                    switch (columnType) {
                        case Types.INTEGER:
                        case Types.SMALLINT:
                        case Types.TINYINT:
                        case Types.BIGINT:
                            record.put(columnName, rs.getLong(i));
                            break;
                        case Types.FLOAT:
                        case Types.DOUBLE:
                        case Types.REAL:
                        case Types.DECIMAL:
                        case Types.NUMERIC:
                            record.put(columnName, rs.getDouble(i));
                            break;
                        case Types.BOOLEAN:
                        case Types.BIT:
                            record.put(columnName, rs.getBoolean(i));
                            break;
                        case Types.DATE:
                        case Types.TIMESTAMP:
                            record.put(columnName, rs.getString(i));
                            break;
                        default:
                            record.put(columnName, rs.getString(i));
                    }
                }

                jsonArray.add(record);
            }

            // Convert ArrayNode to JSON string
            String jsonReport = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonArray);
            System.out.println(jsonReport);

            // Optionally, save to file
            mapper.writeValue(new java.io.File("C:\\path\\to\\students_report.json"), jsonArray);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
