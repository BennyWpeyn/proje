public class Main{
    public static void main(String[] args){
        // örnek öğrenciler
        UndergraduateS ogr1 = new UndergraduateS(100, "osman gültekin", 2011);
        UndergraduateS ogr2 = new UndergraduateS(200, "osmane gültekin", 2011);
        UndergraduateS ogr3 = new UndergraduateS(300, "osmano gültekin", 2011);
        
        System.out.println(ogr1.id_number);
        
        //örnek dersler
        UndergraduateC ugc = new UndergraduateC("Ceng205", "BM giris", 4);
        System.out.println(ugc.course_code + " " + ugc.course_name + " "+ ugc.credit);
        UndergraduateC ugc2 = new UndergraduateC("Ceng205", "BM giris", 4);

        // örnek öğretmenler
        Lecturer lc = new Lecturer(15, "Osman Gültekin");
        Supervisor spv = new Supervisor(150, "Azra Özbelgin");
        
        
        // örnek staff lar
        Secretary sc = new Secretary();


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
        
        spv.addLessontoStudent(ogr1, ugc);
        spv.addLessontoStudent(ogr2, ugc);
        spv.addLessontoStudent(ogr3, ugc);
        System.out.println(ugc.course_code + " " + ugc.course_name + " "+ ugc.credit);
        System.out.println(); 
        System.out.println();
        System.out.println("Studendts id numbers : " +ugc.students_id);
       



    }
}

