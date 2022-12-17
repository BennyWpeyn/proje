import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Supervisor extends Lecturer {
    // danışman
    Scanner sc=new Scanner(System.in);

    public Supervisor(int id_number, String name_surname) {
        super(id_number, name_surname);
    }


List<Student> list_UnderGraduate = new ArrayList<>();
List<Student> list_Graduate = new ArrayList<>();

    public void addUnderStudent(){
        System.out.print("id:");
        int id=sc.nextInt();
        System.out.print("name:");
        String name=sc.next();
        System.out.print("year:");
        int yearr=sc.nextInt();
    
        UndergraduateS us=new UndergraduateS(id, name,yearr );
        GraduateS gs=new GraduateS(id, name, yearr);
        list_UnderGraduate.add(us);
        list_Graduate.add(gs);

        System.out.println("succesfully added :)");
    }
    public void addGraduateStudent(){
        System.out.print("id:");
        int id=sc.nextInt();
        System.out.print("name:");
        String name=sc.next();
        System.out.print("year:");
        int yearr=sc.nextInt();
    
        
        GraduateS gs=new GraduateS(id, name, yearr);
        list_Graduate.add(gs);

        System.out.println("succesfully added :)");
    }




}
