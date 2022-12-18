public class AssistantStuffOfice extends Areas{
    int id_number;
    String name_surname;
    Cleaner[] lisfOfCleaning;
    int numCleaning;
    int assistant_area=50;

    public AssistantStuffOfice(int id_number, String name_surname ){
        this.id_number = id_number;
        this.name_surname = name_surname;
    }

    public void Countnaturalgas(){
        float totalpayment=assistant_area*6;
        System.out.println("Your Natural Gas Bill is:"+totalpayment);

    }


}


