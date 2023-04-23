import java.util.Scanner;

// Reverse a given number in java

public class ReverseNumber {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0, rev = 0;
        System.out.println("Enter a number: ");
        n = in.nextInt();

        Sol obj  = new Sol();

        rev = obj.revNum(n);
        System.out.println("Reverse of " + n + " is " + rev);

        in.close();
        

    }
    
}

class Sol
{
    public int revNum(int A)
    {
        int r_num = 0,digit =0;
        
        while(A != 0)
        {
             digit = A % 10;
            r_num = r_num * 10 + digit;
            A /= 10;
        }
        return  r_num;
    }
}