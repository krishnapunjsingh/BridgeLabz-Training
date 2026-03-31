import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)   // Needed for reflection
@Target(ElementType.METHOD)            // Can be applied only to methods
@interface ImportantMethod {
    String level() default "HIGH";     // Optional parameter with default value
}
