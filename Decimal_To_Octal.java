// Java program to convert decimal number into octal

import java.util.Scanner;

public class Decimal_To_Octal {

    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        n = in.nextInt();
        Sol obj = new Sol();
        obj.convNum(n);
    }
    
}

class Sol
{
    public void convNum (int D)
    {
        int r = 0, octal[] = new int[10], i= 0;
        while(D != 0)
        {
            r = D % 8;
            octal[i++] = r;
            D /= 8;
        }
        System.out.println("The octal value of the number is: ");

        for(int j = i-1; j >= 0; j--)
        {
            System.out.print(octal[j]);
        }
    }
}