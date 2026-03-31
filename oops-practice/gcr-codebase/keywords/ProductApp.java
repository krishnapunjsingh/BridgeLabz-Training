class Product {
    public static double discount = 0.0;
    String productName;
    double price;
    int quantity;
    final String productId;
    public Product(String productId, String productName, double price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }
    public static void updateDiscount(double newDiscount){
        discount = newDiscount;
    }
    double getPriceAfterDiscount(){
        return price - (price * discount /100);
    }
    void displayDetails(){
        
        if(this instanceof Product){
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: $" + getPriceAfterDiscount());
            System.out.println();
        }
    }
}
public class ProductApp{
    public static void main(String[] args) {
        Product.updateDiscount(10.0);
        Product p1 = new Product("P001","Laptop", 1200.0, 5);
        Product p2 = new Product("P002","SmartPhone", 800.0, 10);
        p1.displayDetails();
        p2.displayDetails();
    }
}

