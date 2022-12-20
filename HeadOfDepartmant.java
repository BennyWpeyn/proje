public class HeadOfDepartmant extends Lecturer {

    public HeadOfDepartmant(int id_number, String name_surname) {
        super(id_number, name_surname);
    }


public void sertificateToStudent(Student std){


    if(std.getClass().getName()=="UndergraduateS"){
        if(std.listOfCourses.size()>=40 && std.GPA>=2.00){
        System.out.println(std.name+" have won the certificate!! Congrats!!");

        }
        else{
            System.out.println("Your GPA or total courses is not enough to get certificate!!");
        }
    }
    if(std.getClass().getName()=="MasterStudent"){
        if(std.listOfCourses.size()>=7 && std.GPA>=2.50){
        System.out.println(std.name+" have won the certificate!!");

        }
        else{
            System.out.println("Your GPA or total courses is not enough to get certificate!!");
        }
    }
    if(std.getClass().getName()=="DoctoralStudent"){
        if(std.listOfCourses.size()>=8 && std.GPA>=3.00){
        System.out.println(std.name+" have won the certificate!!");

        }
        else{
            System.out.println("Your GPA or total courses is not enough to get certificate!!");
        }
    }
    

}





    



}
    

