class Patient {
    public static String hospitalName = "City Hospital";
    final String patientId;
    String name;
    int age;
    String ailment;
    public static int totalPatients = 0;
    public Patient(String patientId, String name , String ailment, int age){
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }
    public static void getTotalPatients(){
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
    void displayDetails(){
        if(this instanceof Patient){
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientId);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
        else{
            System.out.println("Invalid Patient instance. ");
        }
    }
    
}
public class PatientApp{
    public static void main(String[] args) {
        Patient p1 = new Patient("P001","Lathika", "Flu", 30);
        Patient p2 = new Patient("P002","Lidiya", "Fracture", 45);
        Patient.getTotalPatients();
        p1.displayDetails();
        p2.displayDetails();
    }
}
