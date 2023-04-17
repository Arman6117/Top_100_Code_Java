
//Find the Greatest Number Among Three Numbers in Java
import java.util.Scanner;

public class GreatestOfThreeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0, b = 0, c = 0, g_num = 0;
        System.out.println("Enter three numbers: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        Sol obj = new Sol();
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("All zero");
        } else 
        {
            g_num = obj.checkNum(a, b, c);
            System.out.println("The greatest number is: " + g_num);
        }
    }
}

class Sol {
    public int checkNum(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {

            return b;
        } else if (c > a && c > b) {
            return c;
        }
        return 0;
    }

}
