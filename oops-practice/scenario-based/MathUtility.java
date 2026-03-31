public class MathUtility {

    // Method to calculate factorial
    static long factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers.");
            return -1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Method to find GCD of two numbers
    static int gcd(int a, int b) {
        if (a < 0) a = Math.abs(a);
        if (b < 0) b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to find nth Fibonacci number
    static int fibonacci(int n) {
        if (n < 0) {
            System.out.println("Fibonacci not defined for negative numbers.");
            return -1;
        }
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    // Main method to test all cases
    public static void main(String[] args) {

        System.out.println("Factorial Tests:");
        System.out.println("5! = " + factorial(5));
        System.out.println("0! = " + factorial(0));
        System.out.println("-3! = " + factorial(-3));

        System.out.println("\nPrime Number Tests:");
        System.out.println("7 is prime? " + isPrime(7));
        System.out.println("1 is prime? " + isPrime(1));
        System.out.println("0 is prime? " + isPrime(0));
        System.out.println("-5 is prime? " + isPrime(-5));

        System.out.println("\nGCD Tests:");
        System.out.println("GCD of 12 and 18 = " + gcd(12, 18));
        System.out.println("GCD of 0 and 5 = " + gcd(0, 5));
        System.out.println("GCD of -4 and 8 = " + gcd(-4, 8));

        System.out.println("\nFibonacci Tests:");
        System.out.println("Fibonacci(6) = " + fibonacci(6));
        System.out.println("Fibonacci(0) = " + fibonacci(0));
        System.out.println("Fibonacci(1) = " + fibonacci(1));
        System.out.println("Fibonacci(-2) = " + fibonacci(-2));
    }
}
