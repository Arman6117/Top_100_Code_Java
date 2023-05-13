// Java program to convert decimal into binary

import java.util.Scanner;

public class Decimal_To_Binary {

    public static void main(String[] args) {
        int decimal = 0;
        Scanner in = new Scanner(System.in);
       
        System.out.println("Enter a decimal number: ");
        decimal = in.nextInt();
        Sol obj = new Sol();
        obj.convNum(decimal);
    }

}

class Sol {
    public void convNum(int d) {
        int r = 0, i = 0;
        int binary[] = new int[10];
        while (d != 0) {
            r = d % 2;
            binary[i++] = r;
            d /= 2;
        }

        System.out.println("The binary of given decimal number is : ");

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
    }
}