import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

    static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            // Remove indices out of current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // Store result when first window is complete
            if (i >= k - 1) {
                result[i - k + 1] = nums[dq.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] ans = maxSlidingWindow(nums, k);

        System.out.print("Sliding Window Maximum: ");
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
