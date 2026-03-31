import java.lang.reflect.Method;

public class ImportantMethodDemo {
    public static void main(String[] args) {

        Class<Service> cls = Service.class;

        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod im = method.getAnnotation(ImportantMethod.class);

                System.out.println("Method Name: " + method.getName());
                System.out.println("Importance Level: " + im.level());
                System.out.println("--------------------");
            }
        }
    }
}
