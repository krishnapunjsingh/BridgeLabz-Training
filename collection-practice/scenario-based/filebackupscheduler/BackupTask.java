public class BackupTask implements Comparable<BackupTask> {

    String folderPath;
    int priority;   
    String time;

    BackupTask(String folderPath, int priority, String time)
            throws InvalidBackupPathException {

        if (folderPath == null || folderPath.isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path!");
        }

        this.folderPath = folderPath;
        this.priority = priority;
        this.time = time;
    }

    @Override
    public int compareTo(BackupTask other) {
        return Integer.compare(other.priority, this.priority);
    }
}
