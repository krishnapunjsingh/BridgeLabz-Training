
public class SearchComparison {

    // Linear Search - O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search - O(log N)
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

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

        int size = 1_000_000;
        int target = size - 1;

        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = i;
        }

        // Linear Search Timing
        long startLinear = System.nanoTime();
        linearSearch(data, target);
        long endLinear = System.nanoTime();

        // Binary Search Timing
        long startBinary = System.nanoTime();
        binarySearch(data, target);
        long endBinary = System.nanoTime();

        System.out.println("Linear Search Time (ns): " + (endLinear - startLinear));
        System.out.println("Binary Search Time (ns): " + (endBinary - startBinary));
    }
}
