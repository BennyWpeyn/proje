import java.util.InputMismatchException;


public class Grades {
    private float midterm ;
    private float finalexam ;
    private float average = -1;
    private String letterGrade;


    public String getLetterGrade() {
        return letterGrade;
    }



    public void calculateAverage(){
        average = (midterm * 4 / 10) + (finalexam * 6 / 10);
        calculateLetterGrade();
    }

    

    public float getMidterm() {
        return midterm;
    }

    
    public float getFinalexam() {
        return finalexam;
    }
    
    
    public float getAverage() {
        return average;
    }
    
    
    public void showGrades(){
        System.out.println("Midterm :\t"+ midterm + "\nFinal :\t"+ finalexam +"\nAverage : \t" + average + "\nLetterGrade : " + letterGrade);

    }

   
    public void setMidterm(float midterm) {
        this.midterm = midterm;
        calculateAverage();
    }


    public void setFinalexam(float finalexam) {
        this.finalexam = finalexam;
        calculateAverage();
    }

    
    public void setGrades(float midterm, float finalexam ){
        try{
            if((0 > midterm && midterm > 100) && (0 > finalexam && finalexam > 100)){
                System.out.println("Please enter the notes between 0 and 100 ");
            }
            
            setMidterm(midterm);
            setFinalexam(finalexam);
        }
        catch(InputMismatchException e){
            System.out.println("Wrong input type. Pleane use numbers");

        }
    }

    private void calculateLetterGrade(){
       if(average <= 100 && average >=90){
        letterGrade = "AA";
       }
       else if(average <= 89 && average >=85){
        letterGrade = "BA";
       }
       else if(average <= 84 && average >=80){
        letterGrade = "BB";
       }
       else if(average <= 79 && average >=75){
        letterGrade = "BC";
       }
       else if(average <= 74 && average >= 65){
        letterGrade = "CC";
       }
       else if(average <= 64 && average >= 60){
        letterGrade = "DC";
       }
       else if(average <= 59 && average >= 55){
        letterGrade = "DD";
       }
       else if(average <= 54 && average >= 50){
        letterGrade = "FD";
       }
       else if(average <= 49 && average >= 0){
        letterGrade = "FF";
       }
        

    }

    

}
