import java.util.*;

import javax.xml.crypto.dsig.keyinfo.X509Data;
class addmatric{
    public static void main(String[]args){
        int a,b,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        a=sc.nextInt();
        System.out.println("enter the columns:");
        b=sc.nextInt();
        int matrix1[][]=new int[a][b];
        int matrix2[][]=new int[a][b];
        int sum[][]=new int[a][b];
        System.out.println("enter the element of first matrix:");
        for(i=0;i<a;i++){
            for(j=0;j<b;j++)
        
        matrix1[i][j]=sc.nextInt();
        System.out.println();}
        System.out.println("enter the element of second matrix");
        for(i=0;i<a;i++){
            for(j=0;j<b;j++)
        matrix2[i][j]=sc.nextInt();
        System.out.println();}
        
        for(i=0;i<a;i++){
            for(j=0;j<b;j++)
            sum[i][j]=matrix1[i][j] + matrix2[i][j];
            System.out.println(" sum of matrix1 and matrix2:");
            for(i=0;i<a;i++)
            for(j=0;j<b;j++)
            System.out.println(sum[i][j]+"\t");

        }
        System.out.println();
    }
}


        


          
    