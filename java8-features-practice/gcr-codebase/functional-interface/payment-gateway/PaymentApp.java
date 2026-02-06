public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor upi = new UpiPayment();
        PaymentProcessor card = new CreditCardPayment();

        upi.processPayment(1000);
        upi.refund(500);  

        card.processPayment(2000);
        card.refund(800);  
    }
}
