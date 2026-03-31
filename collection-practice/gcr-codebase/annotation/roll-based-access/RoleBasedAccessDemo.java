import java.lang.reflect.Method;

public class RoleBasedAccessDemo {

    // Simulate logged-in user role
    static String currentUserRole = "USER"; // change to ADMIN to allow

    public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();
        Class<?> cls = service.getClass();

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(RoleAllowed.class)) {

                RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

                if (roleAllowed.value().equals(currentUserRole)) {
                    method.invoke(service);
                } else {
                    System.out.println(
                        "Access Denied! Required Role: " + roleAllowed.value()
                    );
                }
            }
        }
    }
}
