abstract class ElectionService {

    abstract void registerVoter(Voter voter);

    abstract void addCandidate(Candidate candidate);

    abstract void castVote(Voter voter, Candidate candidate) 
            throws DuplicateVoteException;

    abstract void declareResult();
}
