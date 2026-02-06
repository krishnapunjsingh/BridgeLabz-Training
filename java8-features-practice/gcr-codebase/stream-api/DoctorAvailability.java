import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;

    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }
}

public class DoctorAvailability {

    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Rao", "Cardiology", true),
            new Doctor("Dr. Mehta", "Neurology", false),
            new Doctor("Dr. Singh", "Dermatology", true),
            new Doctor("Dr. Kumar", "Orthopedics", true),
            new Doctor("Dr. Shah", "Cardiology", false)
        );

        doctors.stream()
               // filter doctors available on weekends
               .filter(d -> d.availableOnWeekend)

               // sort by specialty (A → Z)
               .sorted(Comparator.comparing(d -> d.specialty))

               // print result
               .forEach(d ->
                   System.out.println(d.name + " | " + d.specialty)
               );
    }
}
