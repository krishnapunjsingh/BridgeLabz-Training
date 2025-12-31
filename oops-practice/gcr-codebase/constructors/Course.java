class Course {

    String courseName;
    int duration;      // in months
    double fee;

    static String instituteName = "Code Academy";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: ₹" + fee);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 6, 15000.0);
        Course course2 = new Course("Web Development", 4, 12000.0);

        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();

        Course.updateInstituteName("Tech Learning Center");
        System.out.println("\nAfter updating institute name:\n");

        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}