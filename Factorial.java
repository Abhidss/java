 import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num, factorial = 1;

    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        num = scanner.nextInt();

        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}
 
    

