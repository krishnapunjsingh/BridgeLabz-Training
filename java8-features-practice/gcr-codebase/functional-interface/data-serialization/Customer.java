public class Customer implements BackupSerializable {

    int customerId;
    String customerName;

    Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }
}
