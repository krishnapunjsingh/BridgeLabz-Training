class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    // Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = 1500; // fixed cost per day
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRental rental = new CarRental("Alice", "Toyota Camry", 5);
        rental.displayDetails();
    }
}
     