
import java.lang.reflect.Constructor;

class Student{
    private String name;
     
    public Student(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Student Name: " + name);
    }
}
public class StudentDemo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Student");

        Constructor<?> constructor = cls.getConstructor(String.class);
        Object obj = constructor.newInstance("Alice");
        Student student = (Student) obj;
        student.display();
    }
}
