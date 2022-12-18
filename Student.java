import java.util.ArrayList;

public abstract class Student {
    
    // its abstract because we have 2 types of creatable object (undergradueate and gradeted)
    // these instance veriables are final, because they can't be edited after decleration
    final int id_number;
    final String name;
    final int year;
    
    ArrayList<Course> listOfCourses;
    int numCourses;
    ArrayList<Community> listOfCommunity;

    public Student(int id_number, String name, int year) {
        this.id_number = id_number;
        this.name = name;
        this.year = year;
        listOfCourses = new ArrayList<>();
        listOfCommunity=new ArrayList<>();
    }


    public void showGrades(){



    }
    public void showGrades(Course course){
        for(int i = 0; i < numCourses ; i++ ){
            if(course.course_code == listOfCourses.get(i).course_code ){
                if(listOfCourses.get(i).grade.gradeadded){
                    System.out.println(course.course_code +" - "+course.course_name);
                    listOfCourses.get(i).grade.showGrades();
                }
                else{
                    System.out.println(course.course_code +" - "+course.course_name);
                    System.out.println("Lecturer doesn't announced the grades yet !!!");
                } 
            }
                
            
        }

    }
    }