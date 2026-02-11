package jdbcpractice.jdbc.Dao;

import java.sql.*;

import jdbcpractice.jdbc.util.DBConnection;

import java.sql.*;

public class BillDAO {

    public void generateBill(int visitId, double amount) throws Exception {

        String sql = "INSERT INTO bills(visit_id,total_amount,payment_status) VALUES(?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, visitId);
            stmt.setDouble(2, amount);
            stmt.setString(3, "UNPAID");

            stmt.executeUpdate();
            System.out.println("Bill Generated!");
        }
    }
}