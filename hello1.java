import java.util.Scanner;
public class hello1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N;
        N=sc.nextInt();
        if(N%2!=0)
        System.out.println("Weird");
        else if(N%2==0)
        for(int i=2;i<=5;i++){
            System.out.println("Not Weird");
        }
        else if(N%2==0)
        for(int i=6;i<=20;i++){
            System.out.println("Weird");
        }else if(N%2==0)
        for(int i=21;i<N;i++){
            System.out.println("Not Weird");
        }
    }

        
    }




    

