import java.util.*;

public class SetPerformanceTest {

    static final int N = 100000;

    static void testSet(Set<Integer> set, String name) {

        long start, end;

        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            set.add(i);
        }
        end = System.nanoTime();
        System.out.println(name + " Add: " + (end - start));

        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            set.contains(i);
        }
        end = System.nanoTime();
        System.out.println(name + " Search: " + (end - start));

        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            set.remove(i);
        }
        end = System.nanoTime();
        System.out.println(name + " Remove: " + (end - start));

        System.out.println();
    }

    public static void main(String[] args) {

        testSet(new HashSet<>(), "HashSet");
        testSet(new LinkedHashSet<>(), "LinkedHashSet");
        testSet(new TreeSet<>(), "TreeSet");
    }
}
