import java.util.ArrayList;

class Student extends Person {

    private ArrayList<Course> courses;

    public Student(int id, String name) {
        super(id, name);
        courses = new ArrayList<>();
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
