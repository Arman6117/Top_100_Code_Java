// Java Program to print Prime numbers in a given range
import java.util.*;

class PrimeNoInRange {

    public static void main(String[] args) {
        int s = 0 , e = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter start: ");
        s = in.nextInt();

        System.out.println("Enter end: ");
        e = in.nextInt();

        Sol obj = new Sol();

        obj.checkNum(s, e);

        in.close();
    }
}

class Sol 
{
    public boolean isPrime(int i)
    {
        
        for (int j = 2; j < i; j++) {
            if(i % j == 0)
            {
                return false;
            }
        }
        return true;
    }
    public void checkNum(int start, int end)
    {
        
       for (int i = start; i <= end; i++) {
        //    isPrime(i);
          if(isPrime(i))
         {
            System.out.println(i);
         }

       }
    }
    
}