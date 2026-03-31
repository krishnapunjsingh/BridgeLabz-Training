import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheExecutor {

    // Cache storage
    private static final Map<String, Object> cache = new HashMap<>();

    public static Object execute(Object target, String methodName, Object... args)
            throws Exception {

        Class<?> cls = target.getClass();

        // Find method (simple version: match name + param count)
        for (Method method : cls.getDeclaredMethods()) {

            if (method.getName().equals(methodName)
                    && method.isAnnotationPresent(CacheResult.class)) {

                // Create unique cache key
                String key = methodName + "_" + args[0];

                // Return cached value if present
                if (cache.containsKey(key)) {
                    System.out.println("Returning cached result...");
                    return cache.get(key);
                }

                // Invoke method and cache result
                Object result = method.invoke(target, args);
                cache.put(key, result);
                return result;
            }
        }
        throw new RuntimeException("Method not found or not cacheable");
    }
}
