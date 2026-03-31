import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Policy {
    String policyNumber;
    String coverageType;
    LocalDate expiryDate;

    Policy(String policyNumber, String coverageType, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.coverageType = coverageType;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + coverageType + " | " + expiryDate;
    }
}

public class PolicyRetrieval {

    static Set<Policy> policies = new HashSet<>();

    static Set<Policy> getAllUniquePolicies() {
        return policies;
    }

    static List<Policy> getPoliciesExpiringSoon() {
        LocalDate now = LocalDate.now();
        LocalDate limit = now.plusDays(30);

        return policies.stream()
                .filter(p -> !p.expiryDate.isBefore(now) && !p.expiryDate.isAfter(limit))
                .collect(Collectors.toList());
    }

    static List<Policy> getPoliciesByCoverage(String coverageType) {
        return policies.stream()
                .filter(p -> p.coverageType.equalsIgnoreCase(coverageType))
                .collect(Collectors.toList());
    }

    static Set<String> getDuplicatePolicyNumbers(List<Policy> policyList) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (Policy p : policyList) {
            if (!seen.add(p.policyNumber)) {
                duplicates.add(p.policyNumber);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {

        Policy p1 = new Policy("POL101", "Health", LocalDate.now().plusDays(10));
        Policy p2 = new Policy("POL102", "Auto", LocalDate.now().plusDays(40));
        Policy p3 = new Policy("POL103", "Health", LocalDate.now().plusDays(20));

        policies.add(p1);
        policies.add(p2);
        policies.add(p3);

        System.out.println("All Policies: " + getAllUniquePolicies());
        System.out.println("Expiring Soon: " + getPoliciesExpiringSoon());
        System.out.println("Health Coverage: " + getPoliciesByCoverage("Health"));

        List<Policy> policyListWithDuplicates = Arrays.asList(
                p1,
                p2,
                new Policy("POL101", "Health", LocalDate.now().plusDays(5))
        );

        System.out.println("Duplicate Policy Numbers: " +
                getDuplicatePolicyNumbers(policyListWithDuplicates));
    }
}
