import java.util.*;
import java.util.stream.*;
class InsuranceClaim {
    String claimType;
    double amount;

    InsuranceClaim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }
}
public class ClaimAnalysis {

    public static void main(String[] args) {

        List<InsuranceClaim> claims = Arrays.asList(
            new InsuranceClaim("Health", 50000),
            new InsuranceClaim("Health", 70000),
            new InsuranceClaim("Vehicle", 30000),
            new InsuranceClaim("Vehicle", 45000),
            new InsuranceClaim("Property", 100000)
        );

        Map<String, Double> avgClaimByType =
                claims.stream()
                      .collect(Collectors.groupingBy(
                          c -> c.claimType,
                          Collectors.averagingDouble(c -> c.amount)
                      ));

        avgClaimByType.forEach((type, avg) ->
                System.out.println(type + " : " + avg)
        );
    }
}
