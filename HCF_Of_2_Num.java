// Java program to find highest common factor of 2 number

import java.util.Scanner;

public class HCF_Of_2_Num {

   public static void main(String[] args) {
      int ans = 0, no1 = 0,no2 = 0;

      Scanner in = new Scanner(System.in);

      System.out.println("Enter 2 numbers: ");
      no1 = in.nextInt();
      no2 = in.nextInt();

      Sol obj = new Sol();
      ans = obj.checkNum(no1, no2);
      
      System.out.println("The highest common factor of "+no1+" and "+no2+" is "+ ans);
   }    
}

class Sol
{
    public int checkNum(int A,int B)
    {
        int hcf = 1;
        for(int i = 1;i<=A||i<=B;i++)
        {
            if(A % i == 0 && B % i == 0)
            {
                if(i > hcf)
                {
                    hcf = i;
                }
            }
        }
        return hcf;
    }
}