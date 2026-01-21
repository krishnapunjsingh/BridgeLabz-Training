public class UniversityApp {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Maths", new ExamCourse());
        Course<AssignmentCourse> softwareEng = new Course<>("Software Engineering", new AssignmentCourse());
        Course<ResearchCourse> aiResearch = new Course<>("AI Research", new ResearchCourse());

        CourseCatalog catalog = new CourseCatalog();
        catalog.addCourse(math);
        catalog.addCourse(softwareEng);
        catalog.addCourse(aiResearch);

        System.out.println("University course catalog");
        catalog.displayAllCourses();
    }
}
