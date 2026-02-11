package jdbcpractice.jdbc.Dao;


import java.sql.*;

import jdbcpractice.jdbc.util.DBConnection;

public class AppointmentDAO {

	public void bookAppointment(int patientId, int doctorId, Date date, Time time) {
	    try {
	        Connection con = DBConnection.getConnection();
	        String sql = "INSERT INTO appointments (patient_id, doctor_id, appointment_date, appointment_time) VALUES (?, ?, ?, ?)";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setInt(1, patientId);
	        ps.setInt(2, doctorId);
	        ps.setDate(3, date);
	        ps.setTime(4, time);
	        ps.executeUpdate();
	        System.out.println("Appointment booked");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}