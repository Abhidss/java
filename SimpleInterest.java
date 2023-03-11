import java.util.*;
public class SimpleInterest {
    double principle;
    double rate;
     double time;
    
    
  double calSimpleInterest(double p, double rate, double time) {
        principle = p;
        this.rate = rate;
        this.time = time;
        return (principle * this.rate * this.time) / 100;
    }
public static void main(String[]args){
    

 
    
        Scanner input = new Scanner(System.in);
        SimpleInterest si = new SimpleInterest();
        
        System.out.print("Enter principle: ");
        double p = input.nextDouble();
        
        System.out.print("Enter rate: ");
        double rate = input.nextDouble();
        
        System.out.print("Enter time: ");
        double time = input.nextDouble();
        
        double interest = si.calSimpleInterest(p, rate, time);
        
        System.out.println("Simple interest is: " + interest);
    }
}


