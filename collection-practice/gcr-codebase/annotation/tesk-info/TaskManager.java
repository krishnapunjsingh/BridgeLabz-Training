public class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Krishnam")
    public void completeTask() {
        System.out.println("Task completed");
    }
}
