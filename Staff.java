public abstract class Staff {
    // this is abstract because we dont need to create an staff object
    private int id_number;
    private String name_surname;
    private String task_info;
    private int working_hours;

    protected int year_of_experience; //it is "protected" because we wanted to use this variable in Technical class
    private int salary;



public Staff(int id_number,String name_surname,String task_info,int working_hours,int year_of_experience){
this.id_number=id_number;
this.name_surname=name_surname;
this.task_info=task_info;
this.working_hours=working_hours;
this.year_of_experience=year_of_experience;
}
//used get-set methods because variables are defined as "private"
public void setid(int id){ this.id_number=id;}
public int getid(){return id_number;}

public void setname(String name){ this.name_surname=name;}
public String getname(){return name_surname;}

public void settask(String task){ this.task_info=task;}
public String gettask(){return task_info;}

public void setwork(int work){ this.working_hours=work;}
public int getwork(){return working_hours;}

public void setyear(int w_year){ this.year_of_experience=w_year;}
public int getyear(){return year_of_experience;}



final void insurance_premium(float salary){
 float sgk_premium= (salary*14)/100;
 float unemployment_insurance=(salary*1)/100;
 System.out.println("SGK premium:"+ sgk_premium);
 System.out.println("Unemployment insurance:"+ unemployment_insurance);
 salary=salary-(sgk_premium+unemployment_insurance);
System.out.println("Your total salary:"+salary);

}




}
