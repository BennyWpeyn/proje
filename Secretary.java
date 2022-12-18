public class Secretary extends Staff implements CourseOperations{

    int salary_secretary;
    
    public Secretary(int id_number,String name_surname, String task_info,int working_hours,int year_of_experience,int salary){
        super(id_number,name_surname,task_info,working_hours,year_of_experience,salary);
        
    }



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

    public void setCleaner(Areas area , Cleaning cleaner ){
//this sets the cleaner of the area
        area.cleaner=cleaner;


    }



    @Override
    public void net_salary(int salary,int year_of_experience) {
        if(year_of_experience<=10){
            salary=salary+((salary*15)/100);
            System.out.println("Your new salary after "+year_of_experience+" year of your experiences is : "+salary+"");
    }



    }
}
