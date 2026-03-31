public class ResumeScreeningService {

    public static <T extends JobRole> void screenResume(Resume<T> resume) {

        if (!resume.getJobRole().isEligible()) {
            System.out.println("Resume Rejected");
            return;
        }

        System.out.println("Resume Shortlisted for "
                + resume.getJobRole().getRoleName());
    }
}
