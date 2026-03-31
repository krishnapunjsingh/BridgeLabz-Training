import java.util.Arrays;
import java.util.Scanner;

public class StudentAgeCountingSort {

    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;

        int range = maxAge - minAge + 1;
        int[] count = new int[range];

        // Step 1: Count frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Compute cumulative frequency
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Build output array
        int[] output = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int index = count[age - minAge] - 1;
            output[index] = age;
            count[age - minAge]--;
        }

        // Copy sorted ages back
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of students
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        countingSort(ages);
        System.out.println(Arrays.toString(ages));
    }
}
