public class Resume<T extends JobRole> {

    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void displayResume() {
        System.out.println(
            "Candidate: " + candidateName +
            ", Applied Role: " + jobRole.getRoleName()
        );
    }
}
