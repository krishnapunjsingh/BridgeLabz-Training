import java.util.Scanner;

public class FactorOperations {

    public static int[] findFactors(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > max) {
                max = factors[i];
            }
        }
        return max;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println("\nGreatest Factor " + greatestFactor(factors));
        System.out.println("Sum of Factors " + sumOfFactors(factors));
        System.out.println("Product of Factors " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors " + productOfCubes(factors));

    }
}
