import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        double[] marks = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of subject " + (i+1) + ": ");
            marks[i] = sc.nextDouble();
        }
        
    
        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }
        double percentage = (totalMarks / 500) * 100;

        
        if (percentage < 35) {
            System.out.printf("You have failed with %.2f%%\n", percentage);
        } else if (percentage >= 35 && percentage < 45) {
            System.out.printf("You have passed with second class with %.2f%%\n", percentage);
        } else if (percentage >= 45 && percentage < 60) {
            System.out.printf("You have passed with first class with %.2f%%\n", percentage);
        } else if (percentage >= 60 && percentage < 70) {
            System.out.printf("You have passed with distinction with %.2f%%\n", percentage);
        } else {
            System.out.printf("You have passed with excellent distinction with %.2f%%\n", percentage);
        }
        
        sc.close();
    }
}
 
    

