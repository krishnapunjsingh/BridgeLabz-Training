package jdbcpractice.jdbc.main;

import java.sql.Date;
import java.sql.Time;

import jdbcpractice.jdbc.Dao.AppointmentDAO;
import jdbcpractice.jdbc.Dao.DoctorDAO;
import jdbcpractice.jdbc.Dao.PatientDAO;
import jdbcpractice.jdbc.Dao.VisitDAO;


public class MainApp {

    public static void main(String[] args) {

        DoctorDAO doctorDAO = new DoctorDAO();
        PatientDAO patientDAO = new PatientDAO();
        AppointmentDAO appointmentDAO = new AppointmentDAO();
        VisitDAO visitDAO = new VisitDAO();

        doctorDAO.addDoctor("Dr Sharma", "9999999999", 500);

        patientDAO.addPatient("Ravi", 25, "Male");

        try {
			appointmentDAO.bookAppointment(1,1,
			        Date.valueOf("2026-02-15"),
			        Time.valueOf("10:00:00")
			);
		} catch (Exception e) {
			e.printStackTrace();
		}


        try {
			visitDAO.recordVisit(
			        1,
			        "Fever",
			        "Paracetamol"
			);
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        patientDAO.searchPatientByName("Ravi");
        
        patientDAO.updatePatient(1, "Harsh", 22, "Male");
        
        patientDAO.searchPatientByName("Harsh");
       

        System.out.println("All operations completed successfully");
    }
}