// package ecommerceordermanagementsystem;
public class Order {
    private int orderId;
    private Product product;
    private Customer customer;
    private String status;

    public Order(int orderId, Product product, Customer customer) {
        this.orderId = orderId;
        this.product = product;
        this.customer = customer;
        this.status = "CREATED";
    }
    public void placeOrder(Payment payment){
        try {
            payment.pay(product.getPrice()); 
            status = "CONFIRMED";
            System.out.println("Order placed successfully");
        } catch (PaymentFailedException e) {
            status = "PAYMENT FAILED";
            System.out.println("Order failed: " + e.getMessage());
        }
    }
    public void cancelOrder(){
        if (status.equals("CONFIRMED")) {
            status = "CANCELLED";
            System.out.println("Order cancelled successfully");
        } else {
            System.out.println("Order cannot be cancelled");
        }
    }
    public void trackOrder() {
        System.out.println("Order Status: " + status);
    }
}
