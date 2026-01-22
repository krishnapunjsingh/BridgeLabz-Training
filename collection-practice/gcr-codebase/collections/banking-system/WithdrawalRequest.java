public class WithdrawalRequest {
    String accountNumber;
    double amount;

    WithdrawalRequest(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}