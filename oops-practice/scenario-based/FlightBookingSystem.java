import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Flight {
    int flightId;
    String source;
    String destination;
    int price;

    Flight(int flightId, String source, String destination, int price) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    void displayFlight() {
        System.out.println(flightId + " | " + source + " -> " + destination + " | Rs." + price);
    }
}

class Booking {
    Flight flight;
    String passengerName;

    Booking(Flight flight, String passengerName) {
        this.flight = flight;
        this.passengerName = passengerName;
    }

    void displayBooking() {
        System.out.println("Passenger: " + passengerName);
        flight.displayFlight();
    }
}

public class FlightBookingSystem {

    static Flight[] flights = {
        new Flight(101, "Delhi", "Mumbai", 5500),
        new Flight(102, "Delhi", "Bangalore", 6500),
        new Flight(103, "Mumbai", "Chennai", 6000),
        new Flight(104, "Delhi", "Chennai", 7000)
    };

    static List<Booking> bookings = new ArrayList<>();

    static void searchFlights(String source, String destination) {
        boolean found = false;
        for (Flight f : flights) {
            if (f.source.equalsIgnoreCase(source) &&
                f.destination.equalsIgnoreCase(destination)) {
                f.displayFlight();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No flights found.");
        }
    }

    static void bookFlight(int flightId, String passengerName) {
        for (Flight f : flights) {
            if (f.flightId == flightId) {
                bookings.add(new Booking(f, passengerName));
                System.out.println("Flight booked successfully");
                return;
            }
        }
        System.out.println("Invalid Flight ID.");
    }

    static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
        } else {
            for (Booking b : bookings) {
                b.displayBooking();
                System.out.println("----------------------");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n Flight Booking System");
            System.out.println("1. Search Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter source: ");
                    String source = sc.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = sc.nextLine();
                    searchFlights(source, destination);
                    break;

                case 2:
                    System.out.print("Enter Flight ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();
                    bookFlight(id, name);
                    break;

                case 3:
                    viewBookings();
                    break;

                case 4:
                    System.out.println("Thank you for using Flight Booking System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
