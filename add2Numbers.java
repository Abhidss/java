import java.util.Scanner;

// import java.util.Scanner;/

public class add2Numbers {
     
    static boolean b1, b2;
    
    public static void main(String []args)

    {
           /*int a,b,sum;
           Scanner sc = new Scanner(System.in);
                  System.out.println("Enter 2 numbers\n");
                  a = sc.nextInt();
                  b = sc.nextInt();

                  sum = a+b;

                  System.out.println("Sum is " + sum);*/
                 
    {
        int x = 0;
        if ( !b1 ) /* Line 7 */
        {
            if ( !b2 ) /* Line 9 */
            {
                b1 = true;
                x++;
                if ( 5 > 6 ) 
                {
                    x++;
                }
                if ( !b1 ) 
                    x = x + 10;
                else if ( b2 = true ) /* Line 19 */
                    x = x + 100;
                else if ( b1 | b2 ) /* Line 21 */
                    x = x + 1000;
            }
        }
        System.out.println(x);
    }
}

    }
    

          
    
