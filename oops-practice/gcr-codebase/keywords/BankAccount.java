public class BankAccount {
    private static String bankName = "State bank of India";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountHolderName, String accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++; // increment total account with each new Account
    }
    public static void getTotalAccounts(){
        System.out.println("Total Accounts in " + bankName + " are " + totalAccounts);
    }
    public void displayAccountDetails(){
        if(this instanceof BankAccount){
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
        else{
            System.out.println("Invalid Account instance. ");
        }
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited " + amount);
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw " + amount);
        }
        else {
            System.out.println("Insufficient funds or invalid withdrawal amount");
        }
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Lynda Princy", "ACC12345", 1000.00);
        BankAccount account2 = new BankAccount("Prince Danish", "ACC67890", 500.00);
        System.out.print("Account 1 details ");
        account1.displayAccountDetails();
        System.out.print("Account 2 details ");
        account2.displayAccountDetails();
        //check total accounts
        BankAccount.getTotalAccounts();
        System.out.println("perform transaction on account 1");
        account1.deposit(200);
        account1.withdraw(150);
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account2.deposit(100);
        account2.withdraw(800);
    }
}
