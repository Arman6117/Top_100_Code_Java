// Java program to convert given number from binary to octal

import java.util.Scanner;

public class Binary_To_Octal {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int b = 0 ;
    System.out.println("Enter a binary number: ");
    b = in.nextInt();

    Sol obj  = new Sol();
    obj.convDec(b);

  }    
}

class Sol
{
    // First convert binary to decimal
    
    public void convDec(int b)
    {
        int digit = 0, ex = 0, num =0 , dec = 0;;
        while(b != 0)
        {
            digit = b % 10;
            num = (digit * (int)Math.pow(2, ex));
            dec += num;
            ex++;
            b /= 10;
        }
       convOc(dec); 
    }

    public void convOc(int d)
    {
        int rem = 0, i = 0,oct[] = new int[10];

        while(d != 0)
        {
            rem = d % 8;
            oct[i++] = rem;
            d /= 8;
        }
        for(int j = i-1; j>= 0; j--)
        {
            System.out.print(oct[j]);
        }
    }
}