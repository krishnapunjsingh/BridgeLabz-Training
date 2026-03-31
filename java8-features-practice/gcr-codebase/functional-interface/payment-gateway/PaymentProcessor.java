interface PaymentProcessor {

    void processPayment(double amount);

    // New method added later
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed using default mechanism");
    }
}
