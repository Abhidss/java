 import java.util.Scanner;

    public class HelloWorldApp {
     static public void main(String[] args) {
    
    
         Scanner input = new Scanner(System.in);
            int age;
    
            System.out.println("Enter your age");
            age = input.nextInt();
    
            if (age <= 18) { 
            System.out.println("You are a child!");
    
            }
    
            else if (age < 59 && age > 19) {
            System.out.println("You are an adult!"); 
            }
    
            else if (age >= 60); {
    
            System.out.println("You are old!");
    
            }
         }
     }              
    

