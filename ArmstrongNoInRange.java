// Armstrong Numbers between Two Intervals using Java
import java.util.*;


public class ArmstrongNoInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 10,end =10000;
        Sol obj = new Sol();
        
        obj.checkNum(start, end);
    }
    
}

class Sol
{
    public int checkLen(int i)
    {
        int len = 0;
        while(i != 0)
        {
            i /= 10;
            len++;
        }
        return len;
    }
    public void checkNum(int s,int e)
    {
       
      for (int i = s; i <= e; i++) {
        int len = 0,n = 0,temp = 0,sum = 0;
        len = this.checkLen(i);

        n = i;
        while(n != 0)
        {
           temp = n % 10;
           sum = sum + (int)Math.pow(temp, len);
           n /= 10;
        };
        if(sum == i)
        {
            System.out.println(i +" ");
        }
        
      }
    }
}

