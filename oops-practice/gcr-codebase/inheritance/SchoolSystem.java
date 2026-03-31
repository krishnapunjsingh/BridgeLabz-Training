class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayRole(){
        System.out.println("name:" + name);
        System.out.println("age" + age);
    }
}
class Teacher extends Person{
    String subject;
    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    void displayRole(){
        super.displayRole();
        System.out.println("Subject: " + subject);
    }
}
class Student extends Person{
    String grade;
    Student(String name, int age, String grade){
        super(name, age);
        this.grade = grade;
    }
    void displayRole(){
        super.displayRole();
        System.out.println("grade: " + grade);
    }
}
class Staff extends Person{
    int jobTime;
    Staff(String name, int age, int jobTime){
        super(name, age);
        this.jobTime = jobTime;
    }
    void displayRole(){
        super.displayRole();
        System.out.println("jobTime: " + jobTime);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {

        Teacher t = new Teacher("Mr. Sharma", 40, "Math");
        Student s = new Student("Aman", 16, "10th");
        Staff st = new Staff("Ramesh", 35, 8);

        System.out.println("Teacher Details:");
        t.displayRole();

        System.out.println("\nStudent Details:");
        s.displayRole();

        System.out.println("\nStaff Details:");
        st.displayRole();
    }
}
