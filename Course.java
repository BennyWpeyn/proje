import java.util.ArrayList;

public abstract class Course {
    String course_code;
    String course_name;
    int credit;
    
    Classrooms courseLocation;  // classroom
    Lecturer lecturerOfCourse;
    ArrayList<Integer> students_id;
    int numStudents; // number of the students
    

    //grades part
    Grades grade;



}
