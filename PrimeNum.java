import java.util.Scanner;

public class PrimeNum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = 0;
    System.out.println("Enter a number: ");
    n = in.nextInt();

    Sol obj = new Sol();

    obj.checkNum(n);

    in.close();
  }    
}

class Sol 
{
    public void checkNum(int A)
    {
        int cnt = 0;
        if(A == 0)
        {
            System.out.println("Number should be greater than 0");
        }
        else
        {
            for (int i = 2; i < A; i++) {
                if(i % A == 0){
                    cnt++;
                }
            }
            if(cnt == 0)
            {
                System.out.println(A +" is a prime number");
            }
            else
            {
                System.out.println(A +" is not a prime number");
            }
        }
    }
}

