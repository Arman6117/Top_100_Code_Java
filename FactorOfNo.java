// Java program to find factor of a number

import java.util.Scanner;

public class FactorOfNo {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = in.nextInt();
        Sol obj = new Sol();
        obj.checkFact(n);
    }
    
}

class Sol 
{
    public void checkFact(int A)
    {
        int n = 1;
        System.out.print("The factors of "+ A+" is "+n+" ");
        for (int i = 2; i <=A; i++) {
             if(A % i == 0)
             {
                System.out.print(i+" ");
             }

        }
    }
}