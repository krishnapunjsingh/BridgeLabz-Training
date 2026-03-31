import java.util.Scanner;

class NumberChecker5 {

    public static int sumOfProperDivisors(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfectNumber(int num) {
        return sumOfProperDivisors(num) == num;
    }

    public static boolean isAbundantNumber(int num) {
        return sumOfProperDivisors(num) > num;
    }

    public static boolean isDeficientNumber(int num) {
        return sumOfProperDivisors(num) < num;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int num) {
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();

        System.out.println("Is Perfect Number " + isPerfectNumber(num));
        System.out.println("Is Abundant Number " + isAbundantNumber(num));
        System.out.println("Is Deficient Number " + isDeficientNumber(num));
        System.out.println("Is Strong Number " + isStrongNumber(num));

    }
}
