import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements to the set
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        // Check for sequence start
        for (int num : set) {
            if (!set.contains(num - 1)) { // start of sequence
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(arr));
    }
}
