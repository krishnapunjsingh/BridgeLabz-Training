import java.util.Scanner;

class NumberChecker {

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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0)
                return true;
        }
        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == num;
    }

    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }

    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        System.out.println("Smallest digit " + smallest);
        System.out.println("Second smallest digit " + secondSmallest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();

        int[] digits = getDigitsArray(num);

        System.out.println("Count of digits " + countDigits(num));

        System.out.print("Digits: ");
        for (int d : digits)
            System.out.print(d + " ");

        System.out.println("\nIs Duck Number " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number " + isArmstrong(num, digits));

        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
    }
}
