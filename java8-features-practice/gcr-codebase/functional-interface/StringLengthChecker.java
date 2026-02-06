import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        int characterLimit = 20;

        Function<String, Integer> lengthFunction = msg -> msg.length();

        String message = "Welcome to Java Functional Interface";

        int length = lengthFunction.apply(message);

        if (length > characterLimit) {
            System.out.println("Message exceeds character limit");
        } else {
            System.out.println("Message is within character limit");
        }
    }
}
