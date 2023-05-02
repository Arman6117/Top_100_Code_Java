// Java program to check strong number or not

import java.util.Scanner;



public class StrongNo {
 
     public static void main(String[] args) {
        int no = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        no = in.nextInt();
        Sol obj = new Sol();
        obj.checkNum(no);
     }
    
}

class Sol 
{
    public int checkFact(int n)
    {
        int f = 1;
        for(int i = 1; i <=n;i++)
        {
            f = f*i;
        }

        return f;
    }
    public void checkNum(int A)
    {
        int no  = A, digit = 0, fact = 0, strong = 0;
        while(no != 0)
        {
          digit = no % 10;
          fact = checkFact(digit);
          no = no/10;
          strong = strong + fact;
        }

        if(strong == A)
        {
            System.out.println(A+" is a strong number");
        }
        else
        {
            System.out.println(A+" is not a strong number");

        }
    }
}