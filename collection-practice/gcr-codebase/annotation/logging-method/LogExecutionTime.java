import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)   // Required for runtime processing
@Target(ElementType.METHOD)            // Apply only to methods
@interface LogExecutionTime {
}
