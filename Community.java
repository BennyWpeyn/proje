import java.util.ArrayList;

public class Community {
    String nameOfCommunity;
    int population;

    ArrayList<Integer> students_List;

    public Community(String nameOfCommunity, int population) {
        this.nameOfCommunity = nameOfCommunity;
        this.population = population;
        students_List=new ArrayList<>();
    }
    
 
    
}
