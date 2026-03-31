class RegistrationServiceImpl extends RegistrationService {

    private static final int MAX_COURSES = 3;

    @Override
    public void enrollCourse(Student student, String course)
            throws CourseLimitExceededException {

        if (student.getCourses().size() >= MAX_COURSES) {
            throw new CourseLimitExceededException("Course limit exceeded");
        }

        student.getCourses().add(new Course(course));
        System.out.println("Enrolled in: " + course);
    }

    @Override
    public void dropCourse(Student student, String course) {
        student.getCourses().removeIf(
            c -> c.getCourseName().equalsIgnoreCase(course)
        );
        System.out.println("Dropped course: " + course);
    }

    @Override
    public void assignGrade(Student student, String course, String grade) {
        for (Course c : student.getCourses()) {
            if (c.getCourseName().equalsIgnoreCase(course)) {
                c.setGrade(grade);
                System.out.println("Grade assigned");
                return;
            }
        }
    }

    @Override
    public void viewGrades(Student student) {
        System.out.println("\nGrades of " + student.name);
        for (Course c : student.getCourses()) {
            System.out.println(c.getCourseName() + " : " + c.getGrade());
        }
    }
}
