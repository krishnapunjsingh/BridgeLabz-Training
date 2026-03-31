import java.util.Scanner;

class NumberChecker4 {

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

    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        int j = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            reversed[j++] = digits[i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] a, int[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();

        int[] digits = getDigitsArray(num);

        System.out.println("Count of digits " + countDigits(num));

        System.out.print("Digits array ");
        for (int d : digits)
            System.out.print(d + " ");

        int[] reversed = reverseArray(digits);
        System.out.print("\nReversed digits array ");
        for (int d : reversed)
            System.out.print(d + " ");

        System.out.println("\nArrays equal " + areArraysEqual(digits, reversed));
        System.out.println("Is Palindrome " + isPalindrome(digits));
        System.out.println("Is Duck Number " + isDuckNumber(digits));

    }
}
