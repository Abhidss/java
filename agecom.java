import java.util.*;
public class agecom{
    public static void main(String []args){
    Scanner sc= new Scanner(System.in);
       int age; 
       System.out.println("enter a age");
       age=sc.nextInt();
       if(age<=0 && age>=6){
        System.out.println("the baby");
    }
       else if(age>6 && age<=12)
    {
            System.out.println("children");
    }
        else if(age>=12  && age<=18){
            System.out.println("teenager");
        }else if (age>18){
            System.out.println("Adult");

        }
    
        }

    }
    

    
