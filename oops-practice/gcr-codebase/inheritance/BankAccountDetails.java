class BankAccount {
    int accountNumber;
    int balance; 

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    void displayAccountType(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance " + balance);
    }
}
class SavingAccount extends BankAccount{
    int interestRate;

    public SavingAccount(int accountNumber, int balance, int interestRate) {
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }
    void displayAccountType(){
        super.displayAccountType();
        System.out.println("interested: " + interestRate);
    }
    
}
class CheckingAccount extends BankAccount{
    int withdrawalLimit;

    public CheckingAccount(int accountNumber, int balance,  int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType(){
        super.displayAccountType();
        System.out.println("withdrwal limit" + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount{
    int fixDeposit;

    public FixedDepositAccount(int accountNumber, int balance,  int fixDeposit) {
        super(accountNumber, balance);
        this.fixDeposit = fixDeposit;
    }
    void displayAccountType(){
        super.displayAccountType();
        System.out.println("fixed deposit: " + fixDeposit);
    }
    
}
public class BankAccountDetails {
    public static void main(String[] args) {

        SavingAccount sa = new SavingAccount(101, 50000, 5);
        CheckingAccount ca = new CheckingAccount(102, 30000, 20000);
        FixedDepositAccount fd = new FixedDepositAccount(103, 100000, 60000);

        System.out.println("Savings Account:");
        sa.displayAccountType();

        System.out.println("\nChecking Account:");
        ca.displayAccountType();

        System.out.println("\nFixed Deposit Account:");
        fd.displayAccountType();
    }
}

