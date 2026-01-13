public class VotingApp {
    public static void main(String[] args) {

        try {
            ElectionService election = new OnlineElectionService();

            Candidate c1 = new Candidate(1, "Alice");
            Candidate c2 = new Candidate(2, "Bob");

            election.addCandidate(c1);
            election.addCandidate(c2);

            Voter v1 = new Voter(101, "Krishna");
            Voter v2 = new Voter(102, "Rahul");

            election.registerVoter(v1);
            election.registerVoter(v2);

            election.castVote(v1, c1);
            election.castVote(v2, c2);

            
            election.declareResult();

        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }
    }
}
