public class BankAccount {
    public double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount < 0){
            throw new IllegalArgumentException("Invalid amount! ");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance! ");
        }
        balance -= amount;
        System.out.println("Withdraw successfully , new balance " + balance);
    }
    
}
