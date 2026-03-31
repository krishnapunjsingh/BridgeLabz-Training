public class FibonacciComparison {

    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        int n = 30;

        long start, end;

        // Recursive timing
        start = System.currentTimeMillis();
        int recResult = fibonacciRecursive(n);
        end = System.currentTimeMillis();
        System.out.println("Recursive Result: " + recResult);
        System.out.println("Recursive Time: " + (end - start) + " ms");

        // Iterative timing
        start = System.currentTimeMillis();
        int itrResult = fibonacciIterative(n);
        end = System.currentTimeMillis();
        System.out.println("Iterative Result: " + itrResult);
        System.out.println("Iterative Time: " + (end - start) + " ms");
    }
}
