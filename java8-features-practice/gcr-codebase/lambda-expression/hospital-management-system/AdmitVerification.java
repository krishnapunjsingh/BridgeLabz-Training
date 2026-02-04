
import java.util.Arrays;
import java.util.List;

public class AdmitVerification {
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
            new Patient(1, "Amit"),
            new Patient(2, "Riya"),
            new Patient(3, "Sohan")
        );
        patients.stream()
        .map(Patient::getId)
        .forEach(System.out::println);
    }
}
