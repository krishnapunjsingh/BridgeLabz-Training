public class CreditCardPayment implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }

    // Custom refund logic
    @Override
    public void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " initiated to Credit Card");
    }
}
