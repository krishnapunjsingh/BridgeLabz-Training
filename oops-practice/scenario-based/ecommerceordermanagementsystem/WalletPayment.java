// package ecommerceordermanagementsystem;

public class WalletPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount > 10000) {
            throw new PaymentFailedException("Insufficient wallet balance");
        }
        System.out.println("Payment of rs " + amount + " successful via Wallet");
    }
}
