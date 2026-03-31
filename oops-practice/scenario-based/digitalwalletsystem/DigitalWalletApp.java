public class DigitalWalletApp {
    public static void main(String[] args) {

        User u1 = new User(1, "Krishna");
        User u2 = new User(2, "Arjun");

        try {
            u1.getWallet().addMoney(5000);

            TransferService walletTransfer = new WalletTransfer();
            walletTransfer.transfer(u1, u2, 1500);

            System.out.println("\nKrishna Balance: ₹" + u1.getWallet().getBalance());
            System.out.println("Arjun Balance: ₹" + u2.getWallet().getBalance());

            System.out.println("\nKrishna Transactions:");
            u1.getWallet().showTransactions();

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
