import java.util.ArrayList;

public abstract class Student {
    
    // its abstract because we have 2 types of creatable object (undergradueate and gradeted)
    // these instance veriables are final, because they can't be edited after decleration
    final int id_number;
    final String name;
    final int year;
    
    ArrayList<Course> listOfCourses;
    int numCourses;

    public Student(int id_number, String name, int year) {
        this.id_number = id_number;
        this.name = name;
        this.year = year;
        listOfCourses = new ArrayList<>();
    }



}
