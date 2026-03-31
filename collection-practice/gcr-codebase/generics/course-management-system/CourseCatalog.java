
import java.util.ArrayList;
import java.util.List;

public class CourseCatalog {
  private List<Course<? extends CourseType>> courses = new ArrayList<>();
  public void addCourse(Course<? extends CourseType> course){
    courses.add(course);
  }
  public void displayAllCourses(){
    for(Course<? extends CourseType> course : courses ){
        course.displayCourseDetails();
    }
  }
}
