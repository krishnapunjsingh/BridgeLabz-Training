import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class HospitalAlertApp {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient heart rate abnormal"),
            new Alert("INFO", "Appointment reminder"),
            new Alert("Warning" , "High blood presure"),
            new Alert("INFO", "Daily health tip")
        );

        Predicate<Alert> userPreference = a -> a.type.equals("CRITICAL") || a.type.equals("Warning");
        alerts.stream().filter(userPreference).forEach(a -> System.out.println(a));
    }
}
