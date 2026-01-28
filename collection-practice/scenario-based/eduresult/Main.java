import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> district1 = Arrays.asList(
                new Student(1, "Aman", 92),
                new Student(2, "Ravi", 85),
                new Student(3, "Neha", 80)
        );

        List<Student> district2 = Arrays.asList(
                new Student(4, "Kris", 95),
                new Student(5, "Suraj", 85),
                new Student(6, "Vikas", 78)
        );

        List<Student> stateList = new ArrayList<>();
        stateList.addAll(district1);
        stateList.addAll(district2);

        EduResults.mergeSort(stateList);

        System.out.println("State Rank List:");
        int rank = 1;
        for (Student s : stateList) {
            System.out.println(rank++ + ". " + s.name + " - " + s.marks);
        }
    }
}
