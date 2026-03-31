import java.lang.reflect.Method;

public class AnnotationDemo {
    public static void main(String[] args) throws Exception {

        Class<TaskManager> cls = TaskManager.class;

        Method method = cls.getDeclaredMethod("completeTask");

        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        System.out.println("Priority: " + taskInfo.priority());
        System.out.println("Assigned To: " + taskInfo.assignedTo());
    }
}
