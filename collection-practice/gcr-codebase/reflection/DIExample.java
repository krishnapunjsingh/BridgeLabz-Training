import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {
}
class Service {
    public void serve() {
        System.out.println("Service is serving...");
    }
}

class Client {
    @Inject
    private Service service;  // dependency

    public void doSomething() {
        service.serve();
    }
}
import java.lang.reflect.Field;

class SimpleDIContainer {

    public static <T> T getBean(Class<T> clazz) throws Exception {
        // Step 1: Create instance of the class
        T obj = clazz.getDeclaredConstructor().newInstance();

        // Step 2: Iterate all fields
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                // Step 3: Find type of field
                Class<?> fieldType = field.getType();

                // Step 4: Create instance of dependency
                Object dependency = getBean(fieldType);

                // Step 5: Inject dependency
                field.setAccessible(true);
                field.set(obj, dependency);
            }
        }

        return obj;
    }
}
public class DIExample {
    public static void main(String[] args) throws Exception {
        // Get a Client bean with Service injected
        Client client = SimpleDIContainer.getBean(Client.class);

        client.doSomething(); // Output: Service is serving...
    }
}
