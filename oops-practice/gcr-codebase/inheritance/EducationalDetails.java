class Course{
    String courseName;
    int duration;
    Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }
    void displayDetails(){
        System.out.println("Course name: " + courseName);
        System.out.println("Duration of the Course: " + duration);
    }
}
class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration );
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("isRecorded: " + isRecorded);
    }
    

}
class PaidOnlineCourse extends OnlineCourse{
    int fee;
    int discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded , int fee , int discount) {
        super(courseName, duration , platform , isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Fees: " + fee);
        System.out.println("Discount: " + discount);
    }
    
}
public class EducationalDetails {
    public static void main(String[] args) {
        PaidOnlineCourse p1 = new PaidOnlineCourse("Java-course", 4, "udemy", true, 5000, 1000);
        p1.displayDetails();

    }
}
