import java.time.Year;

public class Technical extends Staff {
     
          
    public Technical(int id_number,String name_surname, String task_info,int working_hours,int year_of_experience){
        super(id_number,name_surname,task_info,working_hours,year_of_experience);
        
        
    }
   
    public void net_salary(int salary_tech){
             if(year_of_experience<=10){
                salary_tech=salary_tech+(salary_tech*10)/100;
             }
    }
        
      
            
        
    
}
