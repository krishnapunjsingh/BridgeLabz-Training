import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)   // Required for reflection
@Target(ElementType.METHOD)            // Can be applied to methods
@interface Todo {
    String task();                     // mandatory
    String assignedTo();               // mandatory
    String priority() default "MEDIUM"; // optional with default
}
