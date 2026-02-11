package jdbcpractice.jdbc.Dao;

import java.sql.*;

import jdbcpractice.jdbc.util.DBConnection;

import java.sql.*;

public class VisitDAO {

	public void recordVisit(int appointmentId, String diagnosis, String prescription) {
	    try {
	        Connection con = DBConnection.getConnection();
	        String sql = "INSERT INTO visits (appointment_id, diagnosis, prescription) VALUES (?, ?, ?)";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setInt(1, appointmentId);
	        ps.setString(2, diagnosis);
	        ps.setString(3, prescription);
	        ps.executeUpdate();
	        System.out.println("Visit recorded");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}