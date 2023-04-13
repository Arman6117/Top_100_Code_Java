import java.util.Scanner;

// Java Program to Check Whether a Number is Even or Odd

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter a number: ");
        n = in.nextInt();

        Sol obj = new Sol();
        obj.checkNum(n);
        in.close();
    }
}


class Sol
{
    public void checkNum(int a)
    {
        if(a % 2 == 0 )
        {
            System.out.println(a +" is an even number");
        }
        else if(a == 0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println(a+" is an odd number");
        }
    }
}
