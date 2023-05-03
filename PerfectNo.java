// Java program to find perfect number or not

import java.util.Scanner;

public class PerfectNo {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = 0;
        System.out.println("Enter a number");
        no = in.nextInt();
        Sol obj = new Sol();
        obj.checkNum(no);
    }
    
    
}

class Sol
{
  
    public void checkNum(int A)
    {
        int p = 0;
        for(int i = 1;i<A;i++)
        {
           if( A % i == 0)
           {
             p = p + i;
           }
        }
        if(p == A)
        {
            System.out.println(A + " is a perfect number");
        }
        else
        {
            System.out.println(A + " is not a perfect number");

        }

    }
}