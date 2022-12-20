import java.util.InputMismatchException;


public class Grades {
    private float midterm ;
    private float finalexam ;
    private float average = -1;


    public void calculateAverage(){
        average = (midterm * 4 / 10) + (finalexam * 6 / 10);
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
        System.out.println("Midterm :\t"+ midterm + "\nFinal :\t"+ finalexam +"\n Average : \t" + average);

    }

   
    private void setMidterm(float midterm) {
        this.midterm = midterm;
        calculateAverage();
    }


    private void setFinalexam(float finalexam) {
        this.finalexam = finalexam;
        calculateAverage();
    }

    
    public void setGrades(float midterm, float finalexam ){
        try{
            if((0 > midterm && midterm > 100) && (0 > finalexam && finalexam > 100)){
                System.out.println("Please enter the notes between 0 and 100 ");
                return;
            }
            
            setMidterm(midterm);
            setFinalexam(finalexam);
        }
        catch(InputMismatchException e){
            System.out.println("Wrong input type. Pleane use numbers");

        }



    }

    private void calculateLetterGrade(){
       
        

    }

    

}
