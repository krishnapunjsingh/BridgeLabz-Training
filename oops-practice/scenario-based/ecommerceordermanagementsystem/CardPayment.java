// package ecommerceordermanagementsystem;
public class CardPayment implements Payment {
    public void pay(double ammount) throws PaymentFailedException{
        if(ammount > 50000){
            throw new PaymentFailedException("card limit exceeded");
        }
        System.out.println("Payment of rs " + ammount + " successfully vai Card ");
    }
}
