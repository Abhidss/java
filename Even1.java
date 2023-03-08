import java.util.Scanner;
public  class Even1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n ,sum;
        System.out.println("Enter a number");
        n=sc.nextInt();
        System.out.println("Enter a second number");
        sum=sc.nextInt();
        

        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("The sum of even numbers from 0 to " + n + " is " + sum);
    }
}
 
    

