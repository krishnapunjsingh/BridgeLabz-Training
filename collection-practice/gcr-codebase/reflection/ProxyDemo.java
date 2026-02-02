interface Greeting {
    void sayHello(String name);
}
class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class LoggingHandler implements InvocationHandler {

    private Object target;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log method name before execution
        System.out.println("Method called: " + method.getName());

        // Call the actual method on the target object
        return method.invoke(target, args);
    }
}
public class ProxyDemo {
    public static void main(String[] args) {
        // Original object
        Greeting greeting = new GreetingImpl();

        // Create dynamic proxy
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                greeting.getClass().getClassLoader(),
                greeting.getClass().getInterfaces(),
                new LoggingHandler(greeting)
        );

        // Call method via proxy
        proxyInstance.sayHello("Alice");
    }
}
