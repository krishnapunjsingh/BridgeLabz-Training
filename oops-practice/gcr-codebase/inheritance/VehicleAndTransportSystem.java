
class Vehicle{
    int maxSpeed;
    String fuelType;
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void displayInfo(){
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}
class Car extends Vehicle{
    int seatCapacity;
    Car(int maxSpeed, String fuelType , int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }

}
class Truck extends Vehicle{
    int loadCapacity;
    Truck(int maxSpeed, String fuelType , int loadCapacity){
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}
class MotorCycle extends Vehicle{
    int engineCapacity;
    MotorCycle(int maxSpeed, String fuelType , int engineCapacity){
        super(maxSpeed, fuelType);
        this.engineCapacity = engineCapacity;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Engine Capacity: " + engineCapacity);
    }
}

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        Car car = new Car(180, "Petrol", 5);
        System.out.println("Car Details:");
        car.displayInfo();
        System.out.println();

        Truck truck = new Truck(120, "Diesel", 10000);
        System.out.println("Truck Details:");
        truck.displayInfo();
        System.out.println();

        MotorCycle motorCycle = new MotorCycle(150, "Petrol", 600);
        System.out.println("MotorCycle Details:");
        motorCycle.displayInfo();
    }
}
