

public class Main{

    public static void main(String[] args){
        // örnek öğrenciler
        UndergraduateS ogr2 = new UndergraduateS(200, "osmane gültekin", 2011);
        UndergraduateS ogr3 = new UndergraduateS(300, "osmano gültekin", 2011);
        UndergraduateS ugs1 = new UndergraduateS(100, "osman gültekin", 2011);
        MasterStudent ms = new MasterStudent(100, "Ousmane Gullutekkinoo", 2016);
        DoctoralStudent ds = new DoctoralStudent(100, "Le Osmanne De Gültekinno", 2017);

        
        
       
        
        System.out.println(ugs1.id_number);
        
        //örnek dersler
        UndergraduateC ugc = new UndergraduateC("Ceng205", "BM giris", 4);
        System.out.println(ugc.course_code + " " + ugc.course_name + " "+ ugc.credit);
        UndergraduateC ugc2 = new UndergraduateC("Ceng206", "BM giris", 4);
        GraduateC gc1 = new GraduateC("BM605", "Elektrik Devreleri", 6);
        UndergraduateC ugc3 = new UndergraduateC("Ceng207", "BM giris", 4);
        UndergraduateC ugc4 = new UndergraduateC("Ceng208", "BM giris", 4);

        // örnek öğretmenler
        Lecturer lc = new Lecturer(15, "Osman Gültekin");
        Supervisor spv = new Supervisor(150, "Azra Özbelgin");
        
        // örnek staff lar
        Secretary sc = new Secretary(74,"Eda","secretary",8,5,4000);


        // örnek alanlar
        Classrooms sinif = new Classrooms(416, 56);


        //örnek kodlar
    
        


        sc.setLecturer(ugc2, lc);
        sc.setLecturer(ugc, lc); 
        System.out.println(ugc.lecturerOfCourse.id_number);
        System.out.println(sinif.class_code +" " + sinif.max_population);
        sc.setClassroom(ugc, sinif);
        System.out.println(ugc.courseLocation.class_code);
        
        System.out.println();
        
        spv.addLessontoStudent(ugs1, ugc);
        spv.addLessontoStudent(ogr2, ugc);
        spv.addLessontoStudent(ogr3, ugc);
        System.out.println(ugc.course_code + " " + ugc.course_name + " "+ ugc.credit);
        System.out.println(); 
        System.out.println();
        System.out.println("Studendts id numbers : " +ugc.students_id);
       
        

     //öğrenic kaydı oluşturma  
    //sv.addUnderStudent(); 
    //sv.addMasterStudent();
    //sv.addDoctoralStudent();

    //for trying the add the lisans ogr to master doctoral lessons
        spv.addLessontoStudent(ugs1, gc1);
        spv.addLessontoStudent(ms,ugc);
        spv.addLessontoStudent(ds, ugc);
        spv.addLessontoStudent(ugs1, ugc);
        System.out.println();
        sc.setClassroom(ugc4, sinif);
        sc.setClassroom(ugc2, sinif);
        sc.setClassroom(ugc3, sinif);
        System.out.println("it is working till this line");
        spv.addLessontoStudent(ugs1, ugc2);
        spv.addLessontoStudent(ugs1, ugc3);
        spv.addLessontoStudent(ugs1, ugc4);
        spv.addLessontoStudent(ugs1, ugc4);
   

    Technical tc=new Technical(1, "Ali", "ofis", 6, 7,6000);
     tc.insurance_premium(tc.salary);
     tc.net_salary(tc.salary,tc.year_of_experience);
      
Community c1=new Community("AI",500);
CommunityManager cm=new CommunityManager(c1.nameOfCommunity, c1.population);
cm.addCommunitytoStudent(ugs1, c1);







    }
}

