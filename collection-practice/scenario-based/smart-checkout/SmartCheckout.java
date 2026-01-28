import java.util.*;

public class SmartCheckout {

    private Queue<Customer> checkoutQueue = new LinkedList<>();
    private Map<String, Item> inventory = new HashMap<>();

    // Add item to inventory
    public void addItem(String name, double price, int stock) {
        inventory.put(name, new Item(price, stock));
    }

    // Add customer to queue
    public void addCustomer(Customer customer) {
        checkoutQueue.offer(customer);
        System.out.println(customer.name + " added to checkout queue.");
    }

    // Process customer billing
    public void processCustomer() {
        Customer customer = checkoutQueue.poll();

        if (customer == null) {
            System.out.println("No customers in queue.");
            return;
        }

        double total = 0;
        System.out.println("\nBilling customer: " + customer.name);

        for (String itemName : customer.items) {
            Item item = inventory.get(itemName);

            if (item != null && item.stock > 0) {
                total += item.price;
                item.stock--; // update stock
                System.out.println(itemName + " - ₹" + item.price);
            } else {
                System.out.println(itemName + " - Out of stock!");
            }
        }

        System.out.println("Total Bill: ₹" + total);
    }
}
