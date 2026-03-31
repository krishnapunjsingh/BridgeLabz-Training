class Student {
    public static String UniversityName = "Global University";
    String name;
    final int rollNumber;
    String grade;
    public static int studentCount = 0;
    public Student(String name, int rollNumber, String grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        studentCount++;
    }
    public static void displayStudentCount(){
        System.out.println("Total Students: " + studentCount);
    }
    public static void displayUniversityName(){
        System.out.println("University Name: " + UniversityName);
    }
    void displayDetails(){
        if
        (this instanceof Student){
            System.out.println("University name: " + UniversityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
        else{
            System.out.println("Invalid Student instance. ");
        }
    }
}
public class StudentApp{
    public static void main(String[] args) {
        Student s1 = new Student("Hemashree", 101, "A");
        Student s2 = new Student("Sharmila", 102, "A");
        Student.displayStudentCount();
        s1.displayDetails();
        s2.displayDetails();
        
    }
}
