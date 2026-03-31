import java.util.*;

public class Main {
    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        // Add items
        checkout.addItem("Milk", 50, 5);
        checkout.addItem("Bread", 30, 3);
        checkout.addItem("Eggs", 10, 12);

        // Create customers
        Customer c1 = new Customer("Krishna",
                Arrays.asList("Milk", "Bread", "Eggs"));

        Customer c2 = new Customer("Aman",
                Arrays.asList("Milk", "Milk", "Bread"));

        // Add customers to queue
        checkout.addCustomer(c1);
        checkout.addCustomer(c2);

        // Process queue
        checkout.processCustomer();
        checkout.processCustomer();
        checkout.processCustomer(); // no customers
    }
}
