import java.util.ArrayList;

interface FareCalculator {
    double calculateFare(double distance);
}

class User {
    private int userId;
    private String userName;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}

class Driver {
    private int driverId;
    private String driverName;
    private boolean available;

    public Driver(int driverId, String driverName) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.available = true;
    }

    public String getName() {
        return driverName;
    }

    public void assignRide() {
        available = false;
    }

    public void completeRide() {
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }
}

class Ride {
    private User user;
    private Driver driver;
    private double distance;
    private double fare;

    public Ride(User user, Driver driver, double distance, double fare) {
        this.user = user;
        this.driver = driver;
        this.distance = distance;
        this.fare = fare;
    }

    public void displayDetails() {
        System.out.println("Ride Details: ");
        System.out.println("User Name: " + user.getUserName());
        System.out.println("Driver Name: " + driver.getName());
        System.out.println("Distance: " + distance);
        System.out.println("Fare: " + fare);
    }
}

class PeakFare implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 20;
    }
}

class NormalFare implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 100;
    }
}

class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String message) {
        super(message);
    }
}

class RideBooking {
    private ArrayList<Ride> rideHistory = new ArrayList<>();
    private ArrayList<Driver> driverList;

    public RideBooking(ArrayList<Driver> driverList) {
        this.driverList = driverList;
    }

    public Ride bookRide(User user, double distance, FareCalculator fareCalculator)
            throws NoDriverAvailableException {

        Driver availableDriver = null;

        for (Driver driver : driverList) {
            if (driver.isAvailable()) {
                availableDriver = driver;
                break;
            }
        }

        if (availableDriver == null) {
            throw new NoDriverAvailableException("No drivers available at the moment!");
        }

        availableDriver.assignRide();
        double fare = fareCalculator.calculateFare(distance);

        Ride ride = new Ride(user, availableDriver, distance, fare);
        rideHistory.add(ride);

        return ride;
    }

    public void displayRideHistory() {
        for (Ride ride : rideHistory) {
            ride.displayDetails();
        }
    }
}

public class RideManagementSystem {

    public static void main(String[] args) {

        User user = new User(101, "Harshdeep Singh");

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver(555, "Ankit"));
        drivers.add(new Driver(556, "Krishna"));

        RideBooking rideBooking = new RideBooking(drivers);

        FareCalculator fareCalculator;

        try {
            fareCalculator = new PeakFare();

            Ride ride1 = rideBooking.bookRide(user, 15, fareCalculator);
            ride1.displayDetails();

            Ride ride2 = rideBooking.bookRide(user, 10, fareCalculator);
            ride2.displayDetails();

            Ride ride3 = rideBooking.bookRide(user, 10, fareCalculator);
            ride3.displayDetails();

            System.out.println("Ride History");
            rideBooking.displayRideHistory();

        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
