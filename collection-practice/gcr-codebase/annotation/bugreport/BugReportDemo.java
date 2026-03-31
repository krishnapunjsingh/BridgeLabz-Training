import java.lang.reflect.Method;

public class BugReportDemo {
    public static void main(String[] args) throws Exception {

        Class<BugTracker> cls = BugTracker.class;
        Method method = cls.getDeclaredMethod("process");

        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
    }
}
