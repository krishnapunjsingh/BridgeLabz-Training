import java.util.List;

public class ScreeningPipeline {

    public void processResumes(List<Resume<? extends JobRole>> resumes) {

        for (Resume<? extends JobRole> resume : resumes) {
            resume.displayResume();
        }
    }
}
