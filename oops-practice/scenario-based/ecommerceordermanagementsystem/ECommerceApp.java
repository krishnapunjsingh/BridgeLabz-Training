// package ecommerceordermanagementsystem;

public class ECommerceApp {
    public static void main(String[] args) {
        Product product = new Product(101, "Laptop", 45000);
        Customer customer = new Customer(1, "Krishna");

        Order order = new Order(1001, product, customer);

        Payment payment = new CardPayment();
        order.placeOrder(payment);

        order.trackOrder();
        order.cancelOrder();
        order.trackOrder();
    }

}

