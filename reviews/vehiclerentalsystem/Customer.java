import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bike bike = new Bike("Bullet", "1", 500, "Bike");
        Car car = new Car("EcoSport", "2", 1000, "Car");
        Truck truck = new Truck("Mahindra", "3", 1500, "Truck");

        System.out.println("Enter days:");
        int days = sc.nextInt();

        System.out.println("Bike Rent: " + bike.calculateRent(days));
        System.out.println("Car Rent: " + car.calculateRent(days));
        System.out.println("Truck Rent: " + truck.calculateRent(days));

        System.out.println("Enter 1 to update Bike rent");
        System.out.println("Enter 2 to update Car rent");
        System.out.println("Enter 3 to update Truck rent");

        int choice = sc.nextInt();

        System.out.println("Enter new rent per day:");
        int newRent = sc.nextInt();

        switch (choice) {
            case 1: bike.updatePrice(newRent); break;
            case 2: car.updatePrice(newRent); break;
            case 3: truck.updatePrice(newRent); break;
            default: System.out.println("Invalid choice");
        }

        bike.display();
        car.display();
        truck.display();
    }
}
