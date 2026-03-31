public class EncryptionService {

    static void processEncryption(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Sensitive data detected. Encrypting...");
            // encryption logic here
        } else {
            System.out.println("Data is not sensitive. No encryption needed.");
        }
    }
}
