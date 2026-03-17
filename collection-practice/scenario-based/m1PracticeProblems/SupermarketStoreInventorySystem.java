import java.util.*;

// Base Class
abstract class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    abstract void display();

    double totalValue() {
        return price * quantity;
    }
}

// Electronics
class Electronics extends Product {
    int warranty;

    Electronics(String name, double price, int quantity, int warranty) {
        super(name, price, quantity);
        this.warranty = warranty;
    }

    void display() {
        System.out.println(name + " - Price: " + price + ", Quantity: " + quantity +
                ", Warranty: " + warranty + " months");
    }
}

// Clothing
class Clothing extends Product {
    String size;

    Clothing(String name, double price, int quantity, String size) {
        super(name, price, quantity);
        this.size = size;
    }

    void display() {
        System.out.println(name + " - Price: " + price + ", Quantity: " + quantity +
                ", Size: " + size);
    }
}

public class SupermarketStoreInventorySystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<Product> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();

            if (line.isEmpty()) {
                i--; // handle blank line
                continue;
            }

            String[] parts = line.split(",\\s*");

            String type = parts[0];
            String name = parts[1];
            double price = Double.parseDouble(parts[2]);
            int quantity = Integer.parseInt(parts[3]);

            if (type.equals("Electronics")) {
                int warranty = Integer.parseInt(parts[4]);
                list.add(new Electronics(name, price, quantity, warranty));
            } else if (type.equals("Clothing")) {
                String size = parts[4];
                list.add(new Clothing(name, price, quantity, size));
            }

            System.out.println("Product added to inventory: " + name);
        }

        // Display Inventory
        System.out.println("Inventory:");
        for (Product p : list) {
            p.display();
        }

        // Total Value
        double total = 0;
        for (Product p : list) {
            total += p.totalValue();
        }

        System.out.printf("Total value of the inventory: %.2f\n", total);
    }
}