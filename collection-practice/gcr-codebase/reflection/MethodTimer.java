class MathOperations {

    public void addNumbers() {
        int sum = 0;
        for (int i = 0; i < 1_000_000; i++) sum += i;
    }

    public void multiplyNumbers() {
        long product = 1;
        for (int i = 1; i <= 1000; i++) product *= i;
    }
}
import java.lang.reflect.Method;

public class MethodTimer {

    public static void main(String[] args) throws Exception {

        // Create object
        MathOperations ops = new MathOperations();

        // Get class metadata
        Class<?> cls = ops.getClass();

        // Get all methods
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            // Optional: make private methods accessible
            method.setAccessible(true);

            // Start time
            long start = System.nanoTime();

            // Execute method dynamically
            method.invoke(ops);

            // End time
            long end = System.nanoTime();

            // Print execution time
            System.out.println("Method: " + method.getName() +
                    " | Execution time: " + (end - start) + " ns");
        }
    }
}
