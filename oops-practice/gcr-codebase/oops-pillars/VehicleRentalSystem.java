interface Insurable {
    int calculateInsurance();
    void getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private int rentalRate;

    Vehicle(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public int getRentalRate() {
        return rentalRate;
    }

    abstract int calculateRentalCost(int days);

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Truck(String vehicleNumber, String type, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    int calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    public int calculateInsurance() {
        return 1000;
    }

    public void getInsuranceDetails() {
        System.out.println("Insurance Policy: " + insurancePolicyNumber);
        System.out.println("Insurance Cost: " + calculateInsurance());
    }
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Car(String vehicleNumber, String type, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    int calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    public int calculateInsurance() {
        return 500;
    }

    public void getInsuranceDetails() {
        System.out.println("Insurance Policy: " + insurancePolicyNumber);
        System.out.println("Insurance Cost: " + calculateInsurance());
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Bike(String vehicleNumber, String type, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    int calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    public int calculateInsurance() {
        return 200;
    }

    public void getInsuranceDetails() {
        System.out.println("Insurance Policy: " + insurancePolicyNumber);
        System.out.println("Insurance Cost: " + calculateInsurance());
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Bike("BIKE101", "Bike", 300, "BI-001"),
            new Car("CAR202", "Car", 1000, "CA-002"),
            new Truck("TRUCK303", "Truck", 2000, "TR-003")
        };

        int days = 5;

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost for " + days + " days: " + v.calculateRentalCost(days));

            Insurable ins = (Insurable) v;
            ins.getInsuranceDetails();

            System.out.println("--------------------------------");
        }
    }
}
