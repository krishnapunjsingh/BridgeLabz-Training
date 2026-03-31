public class MainApp {

    public static void main(String[] args) {

        StudentRepository repo = new StudentRepository();
        RegistrationService service = new RegistrationServiceImpl();

        Student s1 = new Student(1, "Krishnam");
        repo.addStudent(s1);

        try {
            service.enrollCourse(s1, "Java");
            service.enrollCourse(s1, "DSA");
            service.enrollCourse(s1, "DBMS");
            service.enrollCourse(s1, "AI"); // Exception
        } catch (CourseLimitExceededException e) {
            System.out.println(e.getMessage());
        }

        service.assignGrade(s1, "Java", "A");
        service.assignGrade(s1, "DSA", "B+");

        service.viewGrades(s1);

        service.dropCourse(s1, "DBMS");
        service.viewGrades(s1);

        repo.updateStudentName(1, "Krishna Singh");
    }
}
