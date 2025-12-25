import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
        } else {
            int sumByRecursion = recursiveSum(n);
            int sumByFormula = formulaSum(n);

            System.out.println("Sum using recursion " + sumByRecursion);
            System.out.println("Sum using formula " + sumByFormula);

            if (sumByRecursion == sumByFormula) {
                System.out.println("Both results are correct and equal");
            } else {
                System.out.println("Results are not equal");
            }
        }

    }
}
