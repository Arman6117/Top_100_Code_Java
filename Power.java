// Java program to find the power of a number
import java.util.*;


public class Power {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 0, expo = 0;
        
        System.out.println("Enter base and expo: ");
        base = sc.nextInt();
        expo = sc.nextInt();

        double ans = 0.0;
        Sol obj = new Sol();

        ans = obj.findPow(base, expo);
        System.out.println("Power is: "+ans);

    }
    
}

class Sol 
{
    public double findPow(int b,int e)
    {
        double Pow = 0.0;
        Pow = Math.pow(b, e);
        return Pow;
    }
}