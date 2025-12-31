// Parent class
class BankAccount {

    // Access modifiers
    public int accountNumber;        // public
    protected String accountHolder;  // protected
    private double balance;          // private

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Child class
class SavingsAccount extends BankAccount {

    double interestRate;

    // Constructor
    SavingsAccount(int accountNumber, String accountHolder,
                   double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Display method
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);   // public
        System.out.println("Account Holder: " + accountHolder);   // protected
        System.out.println("Balance: ₹" + getBalance());          // private via getter
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class
public class BankApp {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(
                10101, "Krishnam", 50000, 4.5
        );

        sa.displayAccountDetails();

        // Update balance
        sa.setBalance(60000);

        System.out.println("\nAfter Balance Update:");
        System.out.println("Updated Balance: ₹" + sa.getBalance());
    }
}
