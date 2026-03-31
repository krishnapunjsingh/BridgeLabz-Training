import java.util.HashMap;

public class PairWithSumMap {

    public static boolean hasPair(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;

            if (map.containsKey(complement)) {
                System.out.println("Pair found: " + num + " + " + complement);
                return true;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        boolean result = hasPair(arr, target);
        System.out.println("Pair exists: " + result);
    }
}
