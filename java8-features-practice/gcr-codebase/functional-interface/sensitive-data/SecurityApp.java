public class SecurityApp {

    public static void main(String[] args) {

        UserCredentials creds = new UserCredentials("admin", "pass123");
        BankAccount account = new BankAccount("1234567890", 50000);
        String normalData = "Public information";

        EncryptionService.processEncryption(creds);
        EncryptionService.processEncryption(account);
        EncryptionService.processEncryption(normalData);
    }
}
