public class BackupService {

    static void backupObject(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("Object is eligible for backup. Processing backup...");
        } else {
            System.out.println("Object is NOT eligible for backup.");
        }
    }
}
