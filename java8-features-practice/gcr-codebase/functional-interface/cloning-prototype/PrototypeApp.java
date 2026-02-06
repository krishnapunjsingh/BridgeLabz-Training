public class PrototypeApp {

    public static void main(String[] args) {

        try {
            Product original = new Product(101, "Laptop", 55000);

            // Clone object
            Product copy = (Product) original.clone();

            System.out.println("Original Product: " + original.name + " - " + original.price);
            System.out.println("Cloned Product: " + copy.name + " - " + copy.price);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}
