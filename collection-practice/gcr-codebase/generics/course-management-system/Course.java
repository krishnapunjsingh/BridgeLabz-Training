public class Course<T extends CourseType> {
    private String courseName;
    private T courseType;
    public Course(String courseName, T courseType){
        this.courseName = courseName;
        this.courseType = courseType;
    }
    public T getCourseType(){
        return courseType;
    }

    public void displayCourseDetails(){
        System.out.println("Course Name: " + courseName + " , Evaluation Type: " + courseType.getEvaluationType());
    }

}
