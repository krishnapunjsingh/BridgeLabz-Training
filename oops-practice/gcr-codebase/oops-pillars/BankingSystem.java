// Interface
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double amount);
}

// Abstract Class
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation (getters only)
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    // Abstract method
    abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // 4% interest
    @Override
    double calculateInterest() {
        return balance * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility(amount)) {
            System.out.println("Loan Approved for Savings Account");
        } else {
            System.out.println("Loan Rejected for Savings Account");
        }
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return balance >= amount * 0.5;
    }
}

// Current Account
class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // 2% interest
    @Override
    double calculateInterest() {
        return balance * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility(amount)) {
            System.out.println("Loan Approved for Current Account");
        } else {
            System.out.println("Loan Rejected for Current Account");
        }
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return balance >= amount * 0.7;
    }
}

// Main Class
public class BankingSystem {
    public static void main(String[] args) {

        // Polymorphism
        BankAccount acc1 = new SavingsAccount(101, "Krishna", 50000);
        BankAccount acc2 = new CurrentAccount(102, "Lakhan", 80000);

        acc1.displayDetails();
        System.out.println("Interest: " + acc1.calculateInterest());
        acc1.deposit(5000);
        acc1.withdraw(2000);

        System.out.println();

        acc2.displayDetails();
        System.out.println("Interest: " + acc2.calculateInterest());
        acc2.deposit(10000);

        System.out.println();

        // Interface usage
        Loanable loan1 = (Loanable) acc1;
        loan1.applyForLoan(20000);

        Loanable loan2 = (Loanable) acc2;
        loan2.applyForLoan(60000);
    }
}
