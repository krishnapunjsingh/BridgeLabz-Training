public class Invoice {
    private int transactionId;

    // Constructor
    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice{transactionId=" + transactionId + "}";
    }
}