// package ecommerceordermanagementsystem;

public class UPIPayment implements Payment {
     public void pay(double amount) throws PaymentFailedException {
        if (amount > 20000) {
            throw new PaymentFailedException("UPI transaction limit exceeded");
        }
        System.out.println("Payment of rs " + amount + " successful via UPI");
    }
}
