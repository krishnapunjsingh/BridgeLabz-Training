import java.util.PriorityQueue;

public class FileBackupScheduler {

    private PriorityQueue<BackupTask> backupQueue = new PriorityQueue<>();

    public void scheduleBackup(String path, int priority, String time)
            throws InvalidBackupPathException {

        BackupTask task = new BackupTask(path, priority, time);
        backupQueue.add(task);

        System.out.println("Backup scheduled for " + path +
                " at " + time + " (Priority: " + priority + ")");
    }

    public void executeBackups() {
        System.out.println("\nExecuting backup tasks:");

        while (!backupQueue.isEmpty()) {
            BackupTask task = backupQueue.poll();
            System.out.println("Backing up " + task.folderPath +
                    " at " + task.time +
                    " [Priority: " + task.priority + "]");
        }
    }

    public static void main(String[] args) {

        FileBackupScheduler scheduler =
                new FileBackupScheduler();

        try {
            scheduler.scheduleBackup("C:/System", 3, "01:00 AM");
            scheduler.scheduleBackup("D:/Documents", 1, "02:00 AM");
            scheduler.scheduleBackup("C:/CriticalData", 5, "12:00 AM");
            scheduler.scheduleBackup("", 2, "03:00 AM"); 
        }
        catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        scheduler.executeBackups();
    }
}
