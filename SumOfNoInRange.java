import java.util.Scanner;

// Find the Sum of the Numbers in a Given Range in Java

public class SumOfNoInRange {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0,end =0,ans =0;

        System.out.println("Enter start of the range: ");
        start = in.nextInt();

        System.out.println("Enter end of the range: ");
        end = in.nextInt();

        Sol obj = new Sol();

        ans = obj.sum(start, end);
        System.out.println("The addition of numbers in given range is: "+ans);
    }
    
}

class Sol 
{
    public int sum (int s,int e)
    {
        int sum = 0;

        for (int i = s; i <= e; i++) {
            sum += i;
        }
       return sum;   
    }
    
}
