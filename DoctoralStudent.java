import java.util.ArrayList;


public class DoctoralStudent extends GraduateS {

    public DoctoralStudent(int id_number, String name, int year) {
        super(id_number, name, year);
        listOfCourses = new ArrayList<>();
    }
    
}
