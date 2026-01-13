import java.util.ArrayList;

class StudentRepository {

    private ArrayList<Student> students = new ArrayList<>();

    // CREATE
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student registered");
    }

    // READ
    public Student getStudentById(int id) {
        for (Student s : students) {
            if (s.id == id) {
                return s;
            }
        }
        return null;
    }

    // UPDATE
    public void updateStudentName(int id, String newName) {
        Student s = getStudentById(id);
        if (s != null) {
            s.name = newName;
            System.out.println("Student name updated");
        }
    }

    // DELETE
    public void deleteStudent(int id) {
        students.removeIf(s -> s.id == id);
        System.out.println("Student deleted");
    }
}
