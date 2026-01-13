import java.util.ArrayList;

class Wallet {
    private double balance;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Wallet() {
        this.balance = 0;
    }

    public void addMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("Add Money", amount));
    }

    public void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Wallet Balance");
        }
        balance -= amount;
        transactions.add(new Transaction("Withdraw Money", amount));
    }

    public double getBalance() {
        return balance;
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            t.display();
        }
    }
}
