package jdbcpractice.jdbc.model;


import java.sql.Date;

public class Visit {

    private int visitId;
    private int appointmentId;
    private String diagnosis;
    private String notes;
    private Date visitDate;

    public Visit() {}

    public Visit(int appointmentId, String diagnosis,
                 String notes, Date visitDate) {
        this.appointmentId = appointmentId;
        this.diagnosis = diagnosis;
        this.notes = notes;
        this.visitDate = visitDate;
    }

    public int getVisitId() { return visitId; }
    public void setVisitId(int visitId) { this.visitId = visitId; }

    public int getAppointmentId() { return appointmentId; }
    public void setAppointmentId(int appointmentId) { this.appointmentId = appointmentId; }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    public Date getVisitDate() { return visitDate; }
    public void setVisitDate(Date visitDate) { this.visitDate = visitDate; }
}