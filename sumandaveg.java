import java.util.*;
public class sumandaveg {
    public static void main(String[]args){
        int n;
        System.out.println("enter a numbers of arrayys:");
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        int arr[]=new int[n];
        System.out.printf("enter a  %d numbers",n);
        
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();}
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=arr[i];      }
                double aver= (sum)/n;
                System.out.println("The sum of numbers:"+sum);
                System.out.println("The average of numbers"+aver);

     
    }
    
}

/*import java.util.Scanner;

public class sumandaveg  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.printf("Enter %d numbers: ", n);
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.printf("Sum = %d\n", sum);
        System.out.printf("Average = %.2f", average);

        input.close();
    }
}*/



















