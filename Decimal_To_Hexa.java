// Java program to convert decimal to hexadecimal number

import java.util.Scanner;

public class Decimal_To_Hexa {

    public static void main(String[] args) {
        int dec = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        dec = in.nextInt();

        Sol obj = new Sol();
        
        obj.convNum(dec);
    }

}

class Sol {
    public void convNum(int D) {
        char hexa[] = new char[10];
        int i = 0, rem = 0;

        while (D != 0) {
            rem = D % 16;
            if (rem < 10) {
                hexa[i] = (char) (rem + 48);
                i++;
            } else {
                hexa[i] = (char) (rem + 55);
                i++;
            }
            D /= 16;

        }
        System.out.println("The hexadecimal number is: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(hexa[j]);
        }
    }
}