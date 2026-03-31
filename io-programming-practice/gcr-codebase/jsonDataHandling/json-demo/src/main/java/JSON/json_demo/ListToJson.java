package JSON.json_demo;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Student {
    public int id;
    public String name;
    public int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}


public class ListToJson {
	public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Tanuj", 21));
        students.add(new Student(2, "Aman", 22));
        students.add(new Student(3, "Riya", 20));

        ObjectMapper mapper = new ObjectMapper();

        // Convert list to JSON array
        String jsonArray = mapper.writerWithDefaultPrettyPrinter()
                                 .writeValueAsString(students);

        System.out.println(jsonArray);
    }
}
