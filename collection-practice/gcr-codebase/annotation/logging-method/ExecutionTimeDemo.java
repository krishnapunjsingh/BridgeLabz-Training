import java.lang.reflect.Method;

public class ExecutionTimeDemo {

    public static void main(String[] args) throws Exception {

        PerformanceService service = new PerformanceService();
        Class<?> cls = service.getClass();

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();
                method.invoke(service);       // method execution
                long end = System.nanoTime();

                System.out.println(
                    method.getName() + " executed in " + (end - start) + " ns"
                );
            }
        }
    }
}
