public class Secretary extends Staff {

 
    
    public Secretary(int id_number,String name_surname, String task_info,int working_hours,int year_of_experience,int salary){
        super(id_number,name_surname,task_info,working_hours,year_of_experience,salary);
        
    }

boolean control=true ;

    public void setLecturer(Course course, Lecturer lecturer) {
       
       try{
        if(control){
        course.lecturerOfCourse = lecturer;
        lecturer.lisfOfCourses[lecturer.numCourses] = course;
        lecturer.numCourses++;
        }
       }
       catch(Exception e){
        System.out.println("This lecturer Access to max course number.");
        System.out.println("Total Course: "+lecturer.numCourses);
        control=false;

       }
        
    }

    public void showLecturer(Course course){
        System.out.println("-Course name: "+course.course_name);
        System.out.println("--Lecturer ID: "+course.lecturerOfCourse.id_number+ "\n--Lecturer Name: "+ course.lecturerOfCourse.name_surname );

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
        if(year_of_experience>=5 && year_of_experience<=10){
            salary=salary+((salary*15)/100);
            
         }

         else if(year_of_experience>=11 && year_of_experience<=20){
            salary=salary+((salary*20)/100);
         }
         else if(year_of_experience>=21 && year_of_experience<=30){
            salary=salary+((salary*25)/100);
         }

         
         System.out.println("Your new salary after "+year_of_experience+" year of your experiences is : "+salary+"");
    }



    }

