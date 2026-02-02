import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)   // Needed at runtime
@Target(ElementType.METHOD)            // Restrict method access
@interface RoleAllowed {
    String value();                    // Required role
}
