import java.util.*;

public class CustomerNameDisplay {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
            "Ravi",
            "anita",
            "Kumar",
            "priya",
            "Suresh"
        );

        names.stream()
             // convert to uppercase
             .map(String::toUpperCase)

             // sort alphabetically
             .sorted()

             // display result
             .forEach(System.out::println);
    }
}
