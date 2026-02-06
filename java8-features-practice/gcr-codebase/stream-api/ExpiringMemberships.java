import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}


public class ExpiringMemberships {

    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
            new Member("Amit", LocalDate.now().plusDays(10)),
            new Member("Ravi", LocalDate.now().plusDays(40)),
            new Member("Neha", LocalDate.now().plusDays(25)),
            new Member("Pooja", LocalDate.now().minusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate limitDate = today.plusDays(30);

        members.stream()
               .filter(m ->
                   !m.expiryDate.isBefore(today) &&
                    m.expiryDate.isBefore(limitDate.plusDays(1))
               )
               .forEach(m ->
                   System.out.println(m.name + " | Expiry: " + m.expiryDate)
               );
    }
}

