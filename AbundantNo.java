// Java program to check abundant number or not

import java.util.Scanner;

public class AbundantNo {

   public static void main(String[] args) {
    int no = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number:");
    no = in.nextInt();

    Sol obj = new Sol();
    obj.checkNum(no);
   }    
}

class Sol
{

    public void checkNum(int A)
    {
        int sum = 0;
        for(int i = 1;i<A;i++)
        {
            if(A % i == 0)
            {
                sum+= i;
            }
        }
        if(sum > A)
        {
            System.out.println(A +" is an Abundant number");
        }
        else
        {
            System.out.println(A +" is not an Abundant number");

        }
    }
}