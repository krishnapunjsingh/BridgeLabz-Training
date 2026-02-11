package jdbcpractice.jdbc.Dao;

import jdbcpractice.jdbc.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DoctorDAO {

    // Add a new doctor
	public void addDoctor(String name, String contact, double fee) {
	    try {
	        Connection con = DBConnection.getConnection();
	        String sql = "INSERT INTO doctors (name, contact, consultation_fee) VALUES (?, ?, ?)";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, name);
	        ps.setString(2, contact);
	        ps.setDouble(3, fee);
	        ps.executeUpdate();
	        System.out.println("Doctor added");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


    public void viewDoctors() throws Exception {

        String sql = "SELECT doctor_id, name, contact, consultation_fee FROM doctors WHERE is_active = true";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("doctor_id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("contact") + " | Fee: " +
                        rs.getDouble("consultation_fee")
                );
            }
        }
    }


    public void updateSpecialty(int doctorId, int newSpecialtyId) throws Exception {

        String sql = "UPDATE doctors SET specialty_id = ? WHERE doctor_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, newSpecialtyId);
            ps.setInt(2, doctorId);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Specialty updated");
            else
                System.out.println("Doctor not found");
        }
    }


    public void deactivateDoctor(int doctorId) throws Exception {

        String sql = "UPDATE doctors SET is_active = false WHERE doctor_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, doctorId);
            ps.executeUpdate();

            System.out.println("Doctor deactivated");
        }
    }
}