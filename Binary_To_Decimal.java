// Java Program to convert Binary to decimal number

import java.util.Scanner;

public class Binary_To_Decimal {

    public static void main(String[] args) {
        int decimal = 0, num = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
        num = in.nextInt();

        Sol obj = new Sol();

        decimal = obj.convNum(num);
        System.out.println("The decimal conversion of "+ num+ " is " +decimal);
    }
}

class Sol
{
    public int convNum(int n)
    {
        int ex = 0,sum = 0,digit = 0,num = 0;
        while(n != 0)
        {
            digit = n % 10;
            num = (digit * (int)Math.pow(2, ex));
            sum += num;
            ex++;
            n /= 10;
        }
        return sum;
    }
}

/*
    1 0 1 1
  ex = 0
    digit n  % 10 ==  1
    num = base 2 exo 0 * digit
    sum += num
    ex++
    while n != 0
 */