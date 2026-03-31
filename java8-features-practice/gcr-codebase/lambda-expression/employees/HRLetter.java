import java.util.Arrays;
import java.util.List;

public class HRLetter {
    public static void main(String[] args) {

        List<String> employeeNames = Arrays.asList(
            "Amit",
            "Riya",
            "Sohan",
            "Neha"
        );

        employeeNames.stream()
                     .map(String::toUpperCase)
                     .forEach(System.out::println);
    }
}
