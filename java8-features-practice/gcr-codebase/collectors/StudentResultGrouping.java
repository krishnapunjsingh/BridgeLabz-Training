import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentResultGrouping {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Ravi", "A"),
                new Student("Anita", "B"),
                new Student("Kumar", "A"),
                new Student("Priya", "C"),
                new Student("Suresh", "B")
        );

        // Group students by grade and collect names
        Map<String, List<String>> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                s -> s.grade,
                                Collectors.mapping(s -> s.name, Collectors.toList())
                        ));

        // Print result
        result.forEach((grade, names) ->
                System.out.println("Grade " + grade + ": " + names)
        );
    }
}
