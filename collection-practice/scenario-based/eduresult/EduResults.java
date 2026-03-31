import java.util.*;

public class EduResults {

    public static void mergeSort(List<Student> students) {
        if (students.size() <= 1) return;

        int mid = students.size() / 2;

        List<Student> left = students.subList(0, mid);
        List<Student> right = students.subList(mid, students.size());

        mergeSort(left);
        mergeSort(right);

        merge(students, left, right);
    }

    private static void merge(List<Student> result, List<Student> left, List<Student> right) {

        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).marks >= right.get(j).marks) {
                result.set(k++, left.get(i++));
            } else {
                result.set(k++, right.get(j++));
            }
        }

        while (i < left.size())
            result.set(k++, left.get(i++));

        while (j < right.size())
            result.set(k++, right.get(j++));
    }
}
