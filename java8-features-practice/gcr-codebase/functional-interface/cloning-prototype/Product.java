public class Product implements Cloneable {

    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Override clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();   // shallow copy
    }
}
