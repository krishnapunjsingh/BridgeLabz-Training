import java.util.ArrayList;
import java.util.List;

interface IRentable {
    int calculateRent(int days);
}

abstract class Vehicle implements IRentable {
    protected int vehicleId;
    protected String brand;
    protected int ratePerDay;

    Vehicle(int vehicleId, String brand, int ratePerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.ratePerDay = ratePerDay;
    }

    public abstract void displayDetails();
}

class Bike extends Vehicle {

    Bike(int vehicleId, String brand, int ratePerDay) {
        super(vehicleId, brand, ratePerDay);
    }

    public int calculateRent(int days) {
        return days * ratePerDay;
    }

    public void displayDetails() {
        System.out.println("Bike ID: " + vehicleId + ", Brand: " + brand + ", Rate/Day: " + ratePerDay);
    }
}

class Car extends Vehicle {

    Car(int vehicleId, String brand, int ratePerDay) {
        super(vehicleId, brand, ratePerDay);
    }

    public int calculateRent(int days) {
        return days * ratePerDay + 500; 
    }

    public void displayDetails() {
        System.out.println("Car ID: " + vehicleId + ", Brand: " + brand + ", Rate/Day: " + ratePerDay);
    }
}

class Truck extends Vehicle {

    Truck(int vehicleId, String brand, int ratePerDay) {
        super(vehicleId, brand, ratePerDay);
    }

    public int calculateRent(int days) {
        return days * ratePerDay + 1000; 
    }

    public void displayDetails() {
        System.out.println("Truck ID: " + vehicleId + ", Brand: " + brand + ", Rate/Day: " + ratePerDay);
    }
}

class Customer {
    protected int customerId;
    protected String name;

    Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId + ", Name: " + name);
    }
}

public class VehicleRentalApp {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bike(1, "Yamaha", 300));
        vehicles.add(new Car(2, "Honda", 1500));
        vehicles.add(new Truck(3, "Tata", 2500));

        Customer customer = new Customer(101, "Kris");

        System.out.println("---- Vehicle List ----");
        for (Vehicle v : vehicles) {
            v.displayDetails();
        }

        for (Vehicle v : vehicles) {
            if (v.vehicleId == 2) {
                v.ratePerDay = 1800;
            }
        }

        vehicles.removeIf(v -> v.vehicleId == 1);

        System.out.println("\n---- After Update & Delete ----");
        for (Vehicle v : vehicles) {
            v.displayDetails();
        }

        System.out.println("\n---- Rent Calculation ----");
        Vehicle rentedVehicle = vehicles.get(0);
        int days = 3;
        System.out.println("Rent for " + days + " days: " + rentedVehicle.calculateRent(days));

        System.out.println("\n---- Customer Details ----");
        customer.displayCustomer();
    }
}
