// Parent class
class Student {

    // Access modifiers
    public int rollNumber;      // public
    protected String name;      // protected
    private double cgpa;        // private

    // Constructor
    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public getter for CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Public setter for CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}

// Child class
class PostgraduateStudent extends Student {

    String specialization;

    // Constructor
    PostgraduateStudent(int rollNumber, String name,
                        double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    // Display method
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name);              // protected
        System.out.println("CGPA: " + getCGPA());          // private via getter
        System.out.println("Specialization: " + specialization);
    }
}

// Main class
public class UniversityApp {
    public static void main(String[] args) {

        PostgraduateStudent pg = new PostgraduateStudent(
                101, "Krishna", 8.4, "Computer Science"
        );

        pg.displayDetails();

        // Modify CGPA using public method
        pg.setCGPA(9.1);

        System.out.println("\nAfter CGPA Update:");
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
