import java.util.ArrayList;

public class MasterStudent extends GraduateS {

    public MasterStudent(int id_number, String name, int year) {
        super(id_number, name, year);
        listOfCourses = new ArrayList<>();
    }
    
}
