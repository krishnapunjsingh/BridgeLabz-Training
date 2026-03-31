interface MedicalRecord {
    void addRecord(String diagnosis);
    void viewRecords();
}
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    private String diagnosis;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public int getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    protected String getDiagnosis() {
        return diagnosis;
    }
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    abstract double calculateBill();
}
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }
    @Override
    double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
    @Override
    public void addRecord(String diagnosis) {
        setDiagnosis(diagnosis);
        System.out.println("Medical record added for In-Patient");
    }
    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + getDiagnosis());
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }
    @Override
    double calculateBill() {
        return consultationFee;
    }
    @Override
    public void addRecord(String diagnosis) {
        setDiagnosis(diagnosis);
        System.out.println("Medical record added for Out-Patient");
    }
    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + getDiagnosis());
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient p1 = new InPatient(101, "Krishna", 25, 5, 3000);
        Patient p2 = new OutPatient(102, "Lakhan", 30, 800);

        p1.getPatientDetails();
        System.out.println("Bill Amount: " + p1.calculateBill());

        System.out.println();

        p2.getPatientDetails();
        System.out.println("Bill Amount: " + p2.calculateBill());

        System.out.println();

        MedicalRecord m1 = (MedicalRecord) p1;
        m1.addRecord("Viral Infection");
        m1.viewRecords();

        System.out.println();

        MedicalRecord m2 = (MedicalRecord) p2;
        m2.addRecord("General Checkup");
        m2.viewRecords();
    }
}
