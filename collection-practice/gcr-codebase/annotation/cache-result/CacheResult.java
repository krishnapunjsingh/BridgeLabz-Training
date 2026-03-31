import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)   // Needed at runtime
@Target(ElementType.METHOD)            // Applied on methods
@interface CacheResult {
}
