import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {
        validate(username);
        this.username = username;
    }

    private void validate(String username) {
        try {
            // Get Field object
            Field field = this.getClass().getDeclaredField("username");

            // Check if annotation is present
            if (field.isAnnotationPresent(MaxLength.class)) {

                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                int max = maxLength.value();

                if (username.length() > max) {
                    throw new IllegalArgumentException(
                        "Username length exceeds max allowed: " + max
                    );
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
