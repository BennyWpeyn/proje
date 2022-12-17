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



}
