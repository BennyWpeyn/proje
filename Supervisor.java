import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Supervisor extends Lecturer {
    // danışman
    Scanner sc=new Scanner(System.in);

    public Supervisor(int id_number, String name_surname) {
        super(id_number, name_surname);
    }








    // adding courses to the student
    public void addLessontoStudent(Student student, Course course){
        if(student.getClass().getName() == "UndergraduateS" && course.getClass().getName() == "GraduateC"){
            System.out.println("Undergraduate Students CAN ONLY take Undergraduate Lessons");
            return;
        }
        else if((student.getClass().getName() == "MasterStudent" || student.getClass().getName() == "DoctoralStudent") && course.getClass().getName() == "UndergraduateC" ){
            System.out.println("Graduate Students CAN ONLY take Graduate Lessons");
            return;
        }
        else if(course.courseLocation == null){
            System.out.println("This course has not a spesific classroom yet.");
            System.out.println("But we are adding the student to the list");
            
        }
        
        else if(course.numStudents >= course.courseLocation.max_population ){
            System.out.println("This Course have reached to max population");
            return;
        }
        for(int i = 0; i < student.numCourses; i++){
            if(student.listOfCourses.get(i).course_code == course.course_code) {
                System.out.println(student.name+" is already have this course");
                return;
            }
        }
        

        student.listOfCourses.add(course);
        student.numCourses++;
        course.students_id.add(student.id_number);
        course.numStudents++;
        System.out.println(student.name+" Is successfully added to "+ course.course_code);
    }


List<Student> list_UnderGraduate = new ArrayList<>();
List<Student> list_Graduate = new ArrayList<>();

    public void addUnderStudent(){
        System.out.print("id:");
        int id=sc.nextInt();
        System.out.print("name:");
        String name=sc.next();
        System.out.print("year:");
        int yearr=sc.nextInt();
    
        UndergraduateS us=new UndergraduateS(id, name,yearr );
        // i did the masterStudent before it , it was graduateS
        list_UnderGraduate.add(us);

        System.out.println("succesfully added :)");
    }
    public void addMasterStudent(){
        System.out.print("id:");
        int id=sc.nextInt();
        System.out.print("name:");
        String name=sc.next();
        System.out.print("year:");
        int yearr=sc.nextInt();
    
        // i did the masterStudent before it , it was graduateS
        MasterStudent ms=new MasterStudent(id, name, yearr);
        list_Graduate.add(ms);

        System.out.println("succesfully added :)");
    }
    public void addDoctoralStudent(){
        System.out.print("id:");
        int id=sc.nextInt();
        System.out.print("name:");
        String name=sc.next();
        System.out.print("year:");
        int yearr=sc.nextInt();
    
        // i did the masterStudent before it , it was graduateS
        DoctoralStudent ds=new DoctoralStudent(id, name, yearr);
        list_Graduate.add(ds);

        System.out.println("succesfully added :)");
    }

 



}
