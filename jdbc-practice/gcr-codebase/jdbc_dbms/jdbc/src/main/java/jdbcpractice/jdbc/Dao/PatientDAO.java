package jdbcpractice.jdbc.Dao;

import java.sql.*;


import jdbcpractice.jdbc.model.Patient;
import jdbcpractice.jdbc.util.DBConnection;
import java.sql.*;

public class PatientDAO {

	public void addPatient(String name, int age, String gender) {
	    try {
	        Connection con = DBConnection.getConnection();
	        String sql = "INSERT INTO patients (name, age, gender) VALUES (?, ?, ?)";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, name);
	        ps.setInt(2, age);
	        ps.setString(3, gender);
	        ps.executeUpdate();
	        System.out.println("Patient added");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


    public void viewPatients() throws Exception {

        String sql = "SELECT * FROM patients";

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("patient_id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("phone")
                );
            }
        }
    }
    
    public void searchPatientByName(String name) {

        String sql = "SELECT * FROM patients WHERE name = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            boolean found = false;

            while (rs.next()) {
                found = true;
                System.out.println(
                        rs.getInt("patient_id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getInt("age") + " | " +
                        rs.getString("gender")
                );
            }

            if (!found) {
                System.out.println("No patient found with name: " + name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updatePatient(int id, String name, int age, String gender) {

        String sql = "UPDATE patients SET name = ?, age = ?, gender = ? WHERE patient_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, gender);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Patient updated successfully.");
            } else {
                System.out.println("Patient not found with ID: " + id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    


}