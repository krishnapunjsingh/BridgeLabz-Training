import java.util.*;

public class VotingSystem {

    Map<String, Integer> votesMap = new HashMap<>();
    LinkedHashMap<String, Integer> linkedVotes = new LinkedHashMap<>();

    void vote(String candidate) {
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);
        linkedVotes.put(candidate, votesMap.get(candidate));
    }

    void displaySortedResults() {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(votesMap);
        System.out.println("Sorted Results: " + sortedMap);
    }

    void displayVoteOrder() {
        System.out.println("Vote Order: " + linkedVotes);
    }

    public static void main(String[] args) {

        VotingSystem vs = new VotingSystem();
        vs.vote("Alice");
        vs.vote("Bob");
        vs.vote("Alice");
        vs.vote("Charlie");
        vs.vote("Bob");

        vs.displaySortedResults();
        vs.displayVoteOrder();
    }
}
