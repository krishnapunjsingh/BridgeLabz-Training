public class Bike extends Vehicle implements iRentable {
    protected int rent;
    protected String type;

    Bike(String name, String id, int rent, String type) {
        super(name, id);
        this.rent = rent;
        this.type = type;
    }

    public int calculateRent(int days) {
        return days * rent;
    }

    public void updatePrice(int newRent) {
        this.rent = newRent;
    }

    void display() {
        super.display();
        System.out.println("Type: " + type + ", Rent per day: " + rent);
    }
}
