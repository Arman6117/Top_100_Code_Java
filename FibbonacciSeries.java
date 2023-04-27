import java.util.Scanner;

// Fibonacci series up to n using java
class FibbonacciSeries
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter a number");
        n = in.nextInt();

        Sol obj = new Sol();

        obj.fib(n);

        in.close();
    }
}

class Sol 
{
    public void fib(int n)
    {
        int a = 0, b = 1, nextTerm = 0;
        System.out.print(a + " , "+b+ " , ");
        for(int i = 2; i<= n;i++)
        {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm+" , ");
        }
    }
}