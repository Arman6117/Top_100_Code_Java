import java.util.Scanner;

// Program to Find the Sum of First N Natural Numbers using java

public class SumOfNaturalNo {
  public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);

    int n = 0;
    System.out.println("Enter a number: ");
    n = in.nextInt();

    int sum = 0;

    Sol obj = new Sol();
    sum =obj.findSum(n);
    
    System.out.println("The sum of first "+n+" natural numbers is: "+sum);
  }    
}

class Sol
{
    public int findSum(int a)
    {
        int ans = 0;
        for(int i = 0;i<= a;i++)
        {
            ans += i;
        }
        return ans;
    }
}