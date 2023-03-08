import java.util.*;
public class hello2 {
    public static void main(String[]args){
        //System.out.println("Hello World:");//
        int i;
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter a number:");
        i=ab.nextInt();
        if(i>0){
            System.out.println("True");
        }
        else if(i<0){
            System.out.println("False");
        }
         System.out.println("The number is"+i);

    }

    
    
}
