public class Cleaning extends Staff {
   

    public Cleaning(int id_number,String name_surname, String task_info,int working_hours,int year_of_experience,int salary){
        super(id_number,name_surname,task_info,working_hours,year_of_experience,salary);
        
    }



    @Override
    public void net_salary(int salary,int year_of_experience) {
        
        if(year_of_experience<=10){
            salary=salary+((salary*5)/100);
            System.out.println("Your new salary after "+year_of_experience+" year of your experiences is : "+salary+"");
    }

}
}
