class Vehicle {
    public static double registrationFee = 0.0;
    String vehicleType;
    String ownerName;
    final String registrationNumber;
    public Vehicle(String registrationNumber, String vehicleType, String ownerName){
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
    }
    public static void updateRegistrationFee(double newFee){
        registrationFee = newFee;
    }
    void displayDetails(){
        if(this instanceof Vehicle){
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
        else{
            System.out.println("Invalid Vehicle instance. ");
        }
    }
}
public class VehicleApp{
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(150.0);
        Vehicle v1 = new Vehicle("ABC123","Sedan", "Honest raj");
        Vehicle v2 = new Vehicle("XYZ789","SUV", "Prince danish");
        v1.displayDetails();
        v2.displayDetails();
    }
}
