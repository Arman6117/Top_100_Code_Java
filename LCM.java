// Java program to find LCM of a number

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int lcm = 0, num1 = 0,num2 = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        Sol obj = new Sol();

        lcm = obj.calcLCM(num1,num2);
        System.out.println("The LCM of "+ num1 +" and "+num2+" is "+lcm);
    }
    
}

class Sol
{
    public int calcLCM(int n1,int n2)
    {
        int max = (n1>n2) ? n1:n2;
        int lcm = 0;
        for(int i = max; i <= n1 * n2;i++)
        {
            if((i % n1 == 0) && (i % n2 == 0))
            {
                lcm = i;
                break;
            }
        }
        return lcm;
    }

}