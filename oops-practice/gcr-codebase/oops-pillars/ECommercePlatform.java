import java.util.ArrayList;

interface Taxable {
    double calculateTax();
    String displayTaxDetails();
}

abstract class Product {
    private String productId;
    private String productName;
    private int price;

    public Product(String productName, String productId, int price) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
    }

    public String getId() {
        return productId;
    }

    public String getName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    abstract double discount();

    void displayDetails() {
        System.out.println("Product name: " + productName);
        System.out.println("Product id: " + productId);
        System.out.println("Product price: " + price);
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(String productName, String productId, int price) {
        super(productName, productId, price);
    }

    double discount() {
        return getPrice() * 0.12;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String displayTaxDetails() {
        return "18% GST on Electronics";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(String productName, String productId, int price) {
        super(productName, productId, price);
    }

    double discount() {
        return getPrice() * 0.20;
    }

    public double calculateTax() {
        return getPrice() * 0.12;
    }

    public String displayTaxDetails() {
        return "12% GST on Clothing";
    }
}

class Groceries extends Product {
    public Groceries(String productName, String productId, int price) {
        super(productName, productId, price);
    }

    double discount() {
        return getPrice() * 0.05;
    }
}

public class ECommercePlatform {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Electronics("Laptop", "E101", 60000));
        products.add(new Clothing("Jacket", "C102", 3000));
        products.add(new Groceries("Rice", "G103", 1200));

        printFinalPrices(products);
    }

    public static void printFinalPrices(ArrayList<Product> products) {
        for (Product product : products) {

            double price = product.getPrice();
            double discount = product.discount();
            double tax = 0;

            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
            }

            double finalPrice = price + tax - discount;

            System.out.println("Product : " + product.getName());
            System.out.println("Base Price : " + price);
            System.out.println("Discount : " + discount);
            System.out.println("Tax : " + tax);
            System.out.println("Final Price : " + finalPrice);
            System.out.println("-----------------------------");
        }
    }
}
