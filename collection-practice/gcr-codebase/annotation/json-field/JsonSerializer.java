import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder("{");
        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();

        for (Field field : fields) {

            if (field.isAnnotationPresent(JsonField.class)) {

                field.setAccessible(true);
                JsonField annotation = field.getAnnotation(JsonField.class);

                try {
                    Object value = field.get(obj);
                    json.append("\"")
                        .append(annotation.name())
                        .append("\":\"")
                        .append(value)
                        .append("\",");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // Remove last comma
        if (json.charAt(json.length() - 1) == ',') {
            json.deleteCharAt(json.length() - 1);
        }

        json.append("}");
        return json.toString();
    }
}
