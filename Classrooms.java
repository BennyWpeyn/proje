public class Classrooms extends Areas {
    int class_code;
    int max_population;
    int classroom_area=150;


    public Classrooms(int class_code , int max_population){
        this.max_population = max_population;
        this.class_code = class_code;

    }

    public void Countnaturalgas(){
        float totalpayment=classroom_area*6;
        System.out.println("Your Natural Gas Bill is:"+totalpayment);

    }


}
