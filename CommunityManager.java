
public class CommunityManager extends Community{


    public CommunityManager(String nameOfCommunity, int population) {
        super(nameOfCommunity, population);
        
    }

    public void addCommunitytoStudent(Student student,Community community){
     student.listOfCommunity.add(community);
     community.population++;
     community.students_List.add(student.id_number);

     System.out.println(student.name+"is succesfully added to "+community.nameOfCommunity);
    

    }
    
}
