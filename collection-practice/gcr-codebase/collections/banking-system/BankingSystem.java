import java.util.*;
public class BankingSystem {

    Map<String, Double> accounts = new HashMap<>();
    Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    void addAccount(Account account) {
        accounts.put(account.accountNumber, account.balance);
    }

    void requestWithdrawal(WithdrawalRequest request) {
        withdrawalQueue.add(request);
    }

    void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest req = withdrawalQueue.poll();
            Double balance = accounts.get(req.accountNumber);
            if (balance != null && balance >= req.amount) {
                accounts.put(req.accountNumber, balance - req.amount);
                System.out.println("Processed: " + req.accountNumber + " withdrew " + req.amount);
            } else {
                System.out.println("Failed: " + req.accountNumber + " insufficient balance");
            }
        }
    }

    void displayAccountsByBalance() {
        TreeMap<Double, List<String>> sorted = new TreeMap<>();
        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            sorted.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        System.out.println("Accounts sorted by balance: " + sorted);
    }

    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        bank.addAccount(new Account("A101", 1000));
        bank.addAccount(new Account("A102", 500));
        bank.addAccount(new Account("A103", 1500));

        bank.requestWithdrawal(new WithdrawalRequest("A101", 200));
        bank.requestWithdrawal(new WithdrawalRequest("A102", 600));
        bank.requestWithdrawal(new WithdrawalRequest("A103", 300));

        bank.processWithdrawals();
        bank.displayAccountsByBalance();
    }
}
