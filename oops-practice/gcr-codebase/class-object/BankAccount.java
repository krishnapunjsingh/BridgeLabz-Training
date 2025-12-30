class BankAccount {

    String accountHolder;
    String accountNumber;
    double balance;

    // Method to display current balance
    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount is : " + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.accountHolder = "State of Chennai";
        account.accountNumber = "ACC1001";
        account.balance = 700.0;

        System.out.println(account.accountHolder);
        account.displayBalance();

        account.deposit(200.0);
        account.withdraw(100.0);
        account.withdraw(1000.0);
    }
}
