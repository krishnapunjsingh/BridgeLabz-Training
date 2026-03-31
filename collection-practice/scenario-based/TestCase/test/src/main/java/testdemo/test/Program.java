package testdemo.test;

public class Program {
	private double balance;

    // Constructor
    public Program(double balance) {
        this.balance = balance;
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Deposit amount cannot be negative");
        }
        balance += amount;
    }

    // Withdraw method
    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient funds.");
        }
        balance -= amount;
    }
}
