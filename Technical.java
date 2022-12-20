

public class Technical extends Staff {
     
       
    public Technical(int id_number,String name_surname, String task_info,int working_hours,int year_of_experience,int salary){
        super(id_number,name_surname,task_info,working_hours,year_of_experience,salary);
        
        
    }
   

    @Override
    public void net_salary(int salary, int year_of_experience) {
        if(year_of_experience>=5 && year_of_experience<=10){
            salary=salary+((salary*10)/100);
         }
         if(year_of_experience>=11 && year_of_experience<=20){
            salary=salary+((salary*15)/100);
         }
         if(year_of_experience>=21 && year_of_experience<=30){
            salary=salary+((salary*20)/100);
         }
         System.out.println("Your new salary after "+year_of_experience+" year of your experiences is : "+salary+"");
        
    }   
}
