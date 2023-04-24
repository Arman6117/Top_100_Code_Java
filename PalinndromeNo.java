// Java program to check given number is palindrome number or not
import java.util.*;


public class PalinndromeNo {
  public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n = 0;
     System.out.println("Enter a number: ");
     n = in.nextInt();

     Sol obj = new Sol();
     
     obj.checkNum(n);
  }
    
}

class Sol
{
   public void checkNum(int A)
   {
     int no = A, rev = 0,digit = 0;
     while(no != 0)
     {
       digit = no % 10;
       rev = rev * 10 + digit;
       no /= 10;
     }
     if(rev == A)
     {
        System.out.println(A + " is a palindrome number");
     }
     else
     {
        System.out.println(A + " is not a palindrome number");

     }
   }
}