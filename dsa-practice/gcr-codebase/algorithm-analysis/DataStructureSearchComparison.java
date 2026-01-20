import java.util.HashSet;
import java.util.TreeSet;

public class DataStructureSearchComparison {

    public static void main(String[] args) {

        int size = 1_000_000;
        int target = size - 1;

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < size; i++) {
            hashSet.add(i);
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < size; i++) {
            treeSet.add(i);
        }

        long start, end;

        start = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                break;
            }
        }
        end = System.currentTimeMillis();
        System.out.println("Array Search Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        hashSet.contains(target);
        end = System.currentTimeMillis();
        System.out.println("HashSet Search Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        treeSet.contains(target);
        end = System.currentTimeMillis();
        System.out.println("TreeSet Search Time: " + (end - start) + " ms");
    }
}
