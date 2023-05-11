// Java Program to convert octal into decimal

import java.util.Scanner;

import javax.swing.event.PopupMenuListener;

public class Octal_To_Decimal {

    public static void main(String[] args) {
        int dec = 0, octal = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a octal number: ");
        octal = in.nextInt();

        Sol obj = new Sol();
        
        dec = obj.convNum(octal);
        System.out.println("The decimal conversion of given octal number " + octal + " is " + dec);
    }
    
}

class Sol
{
    public int convNum (int o)
    {
        int digit = 0,sum = 0,ex = 0;
        while(o != 0)
        {
            digit = o % 10;
            sum = sum + (digit * (int)Math.pow(8, ex));
            ex++;
            o /= 10;
        }

        return sum;
    }
}