class Product {
    String productName;
    double price;

    static int totalProducts = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // Class method (static method)
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 75000.0);
        Product product2 = new Product("Smartphone", 25000.0);

        product1.displayProductDetails();
        product2.displayProductDetails();

        Product.displayTotalProducts();
    }
}