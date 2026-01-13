import java.util.*;

class OnlineElectionService extends ElectionService {

    Map<Integer, Voter> voters = new HashMap<>();
    Map<Integer, Candidate> candidates = new HashMap<>();
    List<Vote> votes = new ArrayList<>();

    void registerVoter(Voter voter) {
        voters.put(voter.voterId, voter);
    }

    void addCandidate(Candidate candidate) {
        candidates.put(candidate.candidateId, candidate);
    }

    void castVote(Voter voter, Candidate candidate) 
            throws DuplicateVoteException {

        if (voter.hasVoted)
            throw new DuplicateVoteException(
                "Voter " + voter.name + " has already voted!");

        Vote vote = new Vote(voter, candidate);
        votes.add(vote);

        candidate.votes++;
        voter.hasVoted = true;

        System.out.println(voter.name + " voted for " + candidate.name);
    }

    void declareResult() {
        System.out.println("\n Election Results:");
        for (Candidate c : candidates.values()) {
            System.out.println(c.name + " → " + c.votes + " votes");
        }
    }
}
