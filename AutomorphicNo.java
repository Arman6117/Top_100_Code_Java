//Java program to check given number is automorphic or not

import java.util.Scanner;

public class AutomorphicNo {

  public static void main(String[] args) {
    int no = 0, sq =0;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number:");
    no = in.nextInt();
    sq = no * no;
    Sol obj = new Sol();
    if(obj.checkNum(no)==1)
    {
        System.out.println("Number "+no +" , Square "+sq+ " is an automorphic number");
    }
    else
    {
        System.out.println("Number "+no +" , Square "+sq+ " is not an automorphic number");

    }
  }    
}

class Sol
{
    public int checkNum(int A)
    {
       int sq = A * A;

        while(A != 0)
        {
           if(A % 10 != sq % 10)
           {
              return 0;
           }
           A /= 10;
           sq /= 10;
        }
         return 1;

    }
}