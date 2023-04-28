// Java program to find factorial of a number

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    int n = 0, facto = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    n = sc.nextInt();
    Sol obj = new Sol();

    facto = obj.checkFact(n);
    System.out.println("The factorial of "+ n +" is: "+ facto);
  }
    
}


class Sol
{
    public int checkFact(int A)
    {
        int facto = 1;
        for(int i = 1; i <= A; i++)
        {
            facto *= i;
        }
        return facto;
    }
}