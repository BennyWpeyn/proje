public class Supervisor extends Lecturer {
    // danışman

    public Supervisor(int id_number, String name_surname) {
        super(id_number, name_surname);
    }





    // adding courses to the student
    public void addLessontoStudent(Student student, Course course){
        
        if(course.courseLocation == null){
            System.out.println("This course has not a spesific classroom yet.");
            return;
        }
        
        else if(course.numStudents >= course.courseLocation.max_population ){
            System.out.println("This Course have reached to max population");
            return;
        }
        
        student.listOfCourses[student.numCourses] = course;
        student.numCourses++;
        course.students_id.add(student.id_number);
        course.numStudents++;
        System.out.println("Successfully added");

    }







}
