public class BackupApp {

    public static void main(String[] args) {

        Employee emp = new Employee(1, "Krishna");
        Customer cust = new Customer(101, "Ravi");
        String data = "Not for backup";

        BackupService.backupObject(emp);
        BackupService.backupObject(cust);
        BackupService.backupObject(data);
    }
}
