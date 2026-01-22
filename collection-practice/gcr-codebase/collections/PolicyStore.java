import java.time.LocalDate;
import java.util.*;

class Policy {
    String policyId;
    LocalDate expiryDate;

    Policy(String policyId, LocalDate expiryDate) {
        this.policyId = policyId;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return Objects.equals(policyId, policy.policyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId);
    }

    @Override
    public String toString() {
        return policyId + " -> " + expiryDate;
    }
}

public class PolicyStore {

    static Set<Policy> hashSet = new HashSet<>();
    static Set<Policy> linkedHashSet = new LinkedHashSet<>();
    static Set<Policy> treeSet = new TreeSet<>(
            Comparator.comparing((Policy p) -> p.expiryDate)
                      .thenComparing(p -> p.policyId)
    );

    static void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public static void main(String[] args) {

        addPolicy(new Policy("P101", LocalDate.of(2026, 5, 10)));
        addPolicy(new Policy("P102", LocalDate.of(2025, 3, 20)));
        addPolicy(new Policy("P103", LocalDate.of(2027, 1, 15)));

        System.out.println("HashSet (Fast Lookup): " + hashSet);
        System.out.println("LinkedHashSet (Insertion Order): " + linkedHashSet);
        System.out.println("TreeSet (Sorted by Expiry): " + treeSet);
    }
}
