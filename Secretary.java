public class Secretary extends Staff implements CourseOperations{
    


    public void setLecturer(Course course, Lecturer lecturer) {
        if(lecturer.numCourses > 9) {
            System.out.println("This lecturer Access to max course number");
            return;
        }
        course.lecturerOfCourse = lecturer;
        lecturer.lisfOfCourses[lecturer.numCourses] = course;
        lecturer.numCourses++;
        
    }

    public void showLecturer(Course course){
        System.out.println(course.lecturerOfCourse.name_surname + " "+ course.lecturerOfCourse.id_number);

    }


    public void setClassroom(Course course, Classrooms classroom){
        course.courseLocation = classroom;


    }



}
