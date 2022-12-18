public class Lecturer {
    int id_number;
    String name_surname;
    Course[] lisfOfCourses;
    int numCourses;

    public Lecturer(int id_number, String name_surname ){
        this.id_number = id_number;
        this.name_surname = name_surname;
        lisfOfCourses = new Course[10];

    }



    public void setGrades(Course course, Student student, float midterm, float finalexam){
        
        for(int j = 0 ; j < numCourses ;j++){
            System.out.println(course.course_code);
            System.out.println(lisfOfCourses[j].course_code);
            if(course.course_code == lisfOfCourses[j].course_code ){
                // if onyl the course we are looking for and the course on the lists
                // course codes are the same, this is working.
                System.out.println("1");
                for(int i = 0; i < student.numCourses ; i++ ){
                    System.out.println("2");
                    if(course.course_code == student.listOfCourses.get(i).course_code ){
                        // it works when the students have this course
                        student.listOfCourses.get(i).grade.setGrades(midterm, finalexam);
                        System.out.println("Grades are added");
                        return;
                    }
                    else{
                        System.out.println("This student doesn't have this course!!!");
                    }
                }
            }
            else {
                System.out.println(name_surname + " doesn't give this lesson !!! ");
            }
        }


    }


}
