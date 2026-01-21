
// import jobrole.*;
// import resume.Resume;
// import service.ResumeScreeningService;
// import pipeline.ScreeningPipeline;

import java.util.ArrayList;
import java.util.List;

public class ResumeApp {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> se =
                new Resume<>("Krishna", new SoftwareEngineer());

        Resume<DataScientist> ds =
                new Resume<>("Anita", new DataScientist());

        Resume<ProductManager> pm =
                new Resume<>("Rahul", new ProductManager());

        ResumeScreeningService.screenResume(se);
        ResumeScreeningService.screenResume(ds);
        ResumeScreeningService.screenResume(pm);

        List<Resume<? extends JobRole>> pipelineList = new ArrayList<>();
        pipelineList.add(se);
        pipelineList.add(ds);
        pipelineList.add(pm);

        System.out.println("\nScreening Pipeline:");
        new ScreeningPipeline().processResumes(pipelineList);
    }
}
