// Java program to check armstrong number or not
import java.util.*;
public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter a number");
        n = in.nextInt();

        Sol obj  = new Sol();

        obj.checkNum(n);
    }
}

class Sol
{
    public void checkNum(int A) // 372
    {
       
        int no = A,temp = 0,cnt = 0,sum = 0;
        while(no != 0)
        {
            no = no / 10;// 37 // 3 // 0 // break
            cnt++; // 1 // 2 // 3  // break
        }
        no = A; // 372
        while(no != 0)
        {
            temp = no % 10;
            sum = sum + (int)Math.pow(temp, cnt);
            no /= 10;
        }
        if(sum == A)
        {
            System.err.println(A +" is an armstrong number");
        }
        else
        {
            System.out.println(A +" is not an armstrong number");
        }
    }
}