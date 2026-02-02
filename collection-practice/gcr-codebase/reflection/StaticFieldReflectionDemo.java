import java.lang.reflect.Field;

class Configuration{
    private static String API_KEY = "OLD_KEY";
}
public class StaticFieldReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Configuration.class;
        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true);
        String oldValue = (String) field.get(null);
        System.out.println("Old API_KEY: " + oldValue);

        field.set(null, "New_API_KEY");
        String newValue = (String) field.get(null);
        System.out.println("New API_KEY: " + newValue);
    }
}
