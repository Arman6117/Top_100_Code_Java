// Java program to find sum of digits of a number 
import java.util.*
;
class SumOfDigits {
   public static void main(String[] args) {
     Scanner in  = new Scanner(System.in);

     int no = 0,sum =0;
     System.out.println("Enter a number: ");
     no = in.nextInt();

     Sol obj = new Sol();

     sum = obj.checkSum(no);
     System.out.println("Sum of digits of the number is: "+ sum);

     in.close();

   }    
}

class Sol
{
    public int checkSum(int A)
    {
        int Sum = 0;

        while(A != 0)
        {
            Sum += A % 10;
            A /= 10;
        }
        return Sum;
    }
}