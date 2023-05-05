// Java program to check given number is harshad number or not

import java.util.Scanner;

public class HarshadNo {

    public static void main(String[] args) {
        int no = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        no = in.nextInt();

        Sol obj = new Sol();
        int sum = obj.checkNum(no);

        if ( no % sum == 0)
        {
          System.out.println(no + " is a harshad number sum of digit is: "+ sum);
        }
        else
        {
          System.out.println(no + " is not a harshad number sum of digit is: "+ sum);
            
        }
    }    
}

class Sol
{
    public int checkNum(int A)
    {
        int sum = 0, digit = 0;
        while(A != 0)
        {
            digit = A % 10;
            sum += digit;
            A = A/10;
        }
        return sum;
    }
}