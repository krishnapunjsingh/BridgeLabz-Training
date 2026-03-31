import java.lang.reflect.Field;

class JsonUtils {

    public static String toJson(Object obj) throws IllegalAccessException {
        if (obj == null) return "null";

        Class<?> cls = obj.getClass();
        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true); // allow access to private fields

            Object value = field.get(obj); // get field value

            json.append("\"").append(field.getName()).append("\": ");

            if (value instanceof String) {
                json.append("\"").append(value).append("\"");
            } else {
                json.append(value);
            }

            if (i < fields.length - 1) {
                json.append(", ");
            }
        }

        json.append("}");
        return json.toString();
    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class TestJson {
    public static void main(String[] args) throws Exception {

        Student student = new Student("Alice", 22);

        String json = JsonUtils.toJson(student);

        System.out.println(json);
    }
}
