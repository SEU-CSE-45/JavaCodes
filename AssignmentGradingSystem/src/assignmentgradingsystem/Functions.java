
package assignmentgradingsystem;

public class Functions {
    
    //Calculate Minimum
    public int Min(int data[]){
        int minValue=data[0];
            for(int i=1;i<data.length;i++){
            minValue=Math.min(minValue, data[i]);
            }
            return minValue;
        }
    public double Add(double a,double b,double c,double d){
        double Add=0;
            Add=a+b+c+d;
            return Add;
        }
    //Calculate Maximum
    public int Max(int data[]){
        int MaxValue=data[0];
            for(int i=1;i<data.length;i++){
            MaxValue=Math.max(MaxValue, data[i]);
    
            }
            return MaxValue;
        }
    //Array Avarage Count
    double Avarage(int data[]){
        double Avarage=0;
            Avarage=ArraySum(data);
            return Avarage/data.length;
    }
    //Array Sum
    double ArraySum(int data[]){
        int sum=0;
            for(int i=0;i<data.length;i++){
            sum=sum+data[i];
            }
            return sum;
    }
    //Calculate Attendance Mark by Useing Absents
    double Attendance(int Absents){
        double AttendanceMark=0;
            for(int i=1;i<Absents;i++){
            AttendanceMark=AttendanceMark+0.5;
            }
            return 5-AttendanceMark;
    }
    //Assessment Mark (Count Best 4 Qe out of 5)
    double Assessment(int data[]){
            double totalSum=ArraySum(data);
            int Minmum=Min(data);
            if(0<Minmum){
            totalSum=totalSum-Minmum;
            }else{
             totalSum=totalSum;       
            }
            
        return (totalSum/40)*25;
    }
    //Grading System 
    String Grade(double mark){
        String grade = "";
            if(mark>=0 && mark<=39){
            grade="F";
            }
        
            if(mark>=40 && mark<=44){
            grade="D";
            }
            if(mark>=45 && mark<=49){
            grade="C";
            }
            if(mark>=50 && mark<=54){
            grade="C+";
            }
            if(mark>=55 && mark<=59){
            grade="B-";
            }
            if(mark>=60 && mark<=64){
            grade="B";
            }
            if(mark>=65 && mark<=69){
            grade="B+";
            }
            if(mark>=70 && mark<=74){
            grade="A-";
            }
            if(mark>=75 && mark<=79){
            grade="A";
            }
            if(mark>=80 && mark<=100){
            grade="A+";
            }
        
 
        return grade;    
    }
    //Std Calculation
    double StD(int data[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = data.length;

        for(double num : data) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: data) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
    
    
}
