import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {

    // Generic method to create object from Map
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        // Step 1: Create a new instance using default constructor
        T obj = clazz.getDeclaredConstructor().newInstance();

        // Step 2: Iterate through map and set fields
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            String fieldName = entry.getKey();
            Object value = entry.getValue();

            try {
                // Get Field object
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true); // allow private access

                // Set field value
                field.set(obj, value);
            } catch (NoSuchFieldException e) {
                System.out.println("Field not found: " + fieldName);
            }
        }

        return obj;
    }
}
import java.util.HashMap;
import java.util.Map;

class Student {
    private String name;
    private int age;

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class TestMapper {
    public static void main(String[] args) throws Exception {

        Map<String, Object> map = new HashMap<>();
        map.put("name", "Alice");
        map.put("age", 22);

        Student student = ObjectMapper.toObject(Student.class, map);
        student.display(); // Output: Name: Alice, Age: 22
    }
}

