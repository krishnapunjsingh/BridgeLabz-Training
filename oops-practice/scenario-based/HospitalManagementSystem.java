import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface IPayable {
    double calculateBill();
}

class Doctor {
    private int doctorId;
    private String name;
    private String specialization;

    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public String getDoctorDetails() {
        return name + " (" + specialization + ")";
    }
}

abstract class Patient implements IPayable {

    private int patientId;
    private String name;
    private int age;
    private Doctor doctor;

    public Patient(int patientId, String name, int age, Doctor doctor) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.doctor = doctor;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public abstract void displayInfo();
}

class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int id, String name, int age, Doctor doctor,
                     int daysAdmitted, double dailyCharge) {
        super(id, name, age, doctor);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient ID: " + getPatientId());
        System.out.println("Name: " + getName());
        System.out.println("Doctor: " + getDoctor().getDoctorDetails());
        System.out.println("Total Bill: ₹" + calculateBill());
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int id, String name, int age, Doctor doctor,
                      double consultationFee) {
        super(id, name, age, doctor);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void displayInfo() {
        System.out.println("OutPatient ID: " + getPatientId());
        System.out.println("Name: " + getName());
        System.out.println("Doctor: " + getDoctor().getDoctorDetails());
        System.out.println("Total Bill: ₹" + calculateBill());
    }
}

class Bill {
    public static void generateBill(IPayable payable) {
        System.out.println("Bill Amount: ₹" + payable.calculateBill());
    }
}

public class HospitalManagementSystem {

    static List<Patient> patients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Doctor doctor = new Doctor(101, "Dr. Mehta", "General");

        while (true) {
            System.out.println("\n--- Hospital Patient Management ---");
            System.out.println("1. Add InPatient");
            System.out.println("2. Add OutPatient");
            System.out.println("3. View Patients");
            System.out.println("4. Delete Patient");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addInPatient(doctor);
                case 2 -> addOutPatient(doctor);
                case 3 -> viewPatients();
                case 4 -> deletePatient();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void addInPatient(Doctor doctor) {
        System.out.print("Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Days Admitted: ");
        int days = sc.nextInt();
        System.out.print("Daily Charge: ");
        double charge = sc.nextDouble();

        patients.add(new InPatient(id, name, age, doctor, days, charge));
        System.out.println("InPatient added successfully.");
    }

    static void addOutPatient(Doctor doctor) {
        System.out.print("Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Consultation Fee: ");
        double fee = sc.nextDouble();

        patients.add(new OutPatient(id, name, age, doctor, fee));
        System.out.println("OutPatient added successfully.");
    }

    static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }
        for (Patient p : patients) {
            p.displayInfo();  
            System.out.println("--------------------");
        }
    }

    static void deletePatient() {
        System.out.print("Enter Patient ID to delete: ");
        int id = sc.nextInt();
        patients.removeIf(p -> p.getPatientId() == id);
        System.out.println("Patient deleted if ID existed.");
    }
}
