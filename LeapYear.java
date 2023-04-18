// Java program to check a year is leap year or not

import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = 0;
        System.out.println("Enter a year: ");
        year = in.nextInt();

        Sol obj = new Sol();

        obj.checkLeap(year);

        in.close();
    }
}

class Sol {
    public void checkLeap(int y) {
        System.out.println("In sol");
        if (y % 400 == 0) // The year is must be divisible by 400
        {
            System.out.println(y + " is a leap year");
            
        } else if ((y % 4 == 0) && (y % 100 != 0)) // The year must be divisible by 4 but not 100
        {
            System.out.println(y + " is a leap year");
        } else {
            System.out.println(y + " is not a leap year");
        }

    }
}