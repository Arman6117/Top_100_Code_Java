import java.util.Scanner;

public class GreatestOfTowNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          
        int n1 = 0, n2 =0, g_num = 0;
        System.out.println("Enter 2 numbers");
        n1 = in.nextInt();
        n2 = in.nextInt();

        if(n1 == 0 && n2 ==0)
        {
            System.out.println("Both are zero");
        }
        else
        {
            Sol obj = new Sol();
            g_num = obj.checkNum(n1, n2);
            System.err.println(g_num +" is the greatest");
        }

    }
}

class Sol 
{
    public int checkNum(int n1,int n2)
    {
        if(n1>n2 )
        {
            return n1;
        }
        else if(n1<n2)
        {
            return n2;
        }
     return 0;   
    }
}