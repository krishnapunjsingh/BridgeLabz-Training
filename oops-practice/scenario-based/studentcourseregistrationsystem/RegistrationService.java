abstract class RegistrationService {

    public abstract void enrollCourse(Student student, String course)
            throws CourseLimitExceededException;

    public abstract void dropCourse(Student student, String course);

    public abstract void assignGrade(Student student, String course, String grade);

    public abstract void viewGrades(Student student);
}
