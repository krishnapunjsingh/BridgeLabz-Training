import java.util.Arrays;

public class LinearAndBinarySearchExample {

    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);
            if (val >= 1 && val <= n) {
                if (arr[val - 1] > 0) {
                    arr[val - 1] = -arr[val - 1];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {3, 4, -1, 1};
        int target = 4;

        int[] copyForMissing = Arrays.copyOf(numbers, numbers.length);

        int missing = firstMissingPositive(copyForMissing);
        System.out.println("First missing positive: " + missing);

        Arrays.sort(numbers);

        int index = binarySearch(numbers, target);
        System.out.println("Index of target " + target + ": " + index);
    }
}
