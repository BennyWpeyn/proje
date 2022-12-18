import java.util.ArrayList;

public class GraduateC extends Course {
    Classrooms classroom;


    public GraduateC(String course_code, String course_name, int credit) {
        this.course_code = course_code;
        this.course_name = course_name;
        this.credit = credit;
        students_id = new ArrayList<>();
        grade = new Grades();
    }



}
