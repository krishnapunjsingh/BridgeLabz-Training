import java.lang.reflect.Method;
import java.util.Scanner;

class Operations {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class MathOperations {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter method name (add / subtract / multiply): ");
        String methodName = sc.nextLine();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Create object
        Operations ops = new Operations();

        // Get class metadata
        Class<?> cls = ops.getClass();

        // Get method dynamically
        Method method = cls.getDeclaredMethod(methodName, int.class, int.class);

        // Invoke method dynamically
        int result = (int) method.invoke(ops, a, b);

        // Print result
        System.out.println("Result: " + result);
    }
}
