import java.util.Scanner;

class NumberChecker2 {

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] getDigitsArray(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // digit
            freq[i][1] = 0; // frequency
        }

        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();

        int[] digits = getDigitsArray(num);

        System.out.println("Count of digits " + countDigits(num));
        System.out.print("Digits ");
        for (int d : digits)
            System.out.print(d + " ");

        System.out.println("\nSum of digits " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number " + isHarshadNumber(num, digits));

        System.out.println("\nDigit Frequency:");
        int[][] frequency = digitFrequency(digits);
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " → " + frequency[i][1] + " time(s)");
            }
        }
    }
}
