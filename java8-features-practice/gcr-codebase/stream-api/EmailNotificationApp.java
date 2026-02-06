import java.util.*;

public class EmailNotificationApp {

    // Dummy method to simulate sending email
    static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "user2@gmail.com",
                "user3@gmail.com"
        );

        // Send notification to each email
        emails.forEach(email -> sendEmailNotification(email));
    }
}
