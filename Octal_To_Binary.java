// Java program to convert binary to octal

/**
 * Octal_To_Binary
 */
public class Octal_To_Binary {

    public static void main(String[] args) {
        Sol obj = new Sol();
        obj.convToDec(13);
    }
}

class Sol
{
    public void convToDec (int d)
    {
        int ex= 0,num = 0, dec = 0,rem = 0;
         while( d != 0)
         {
            rem = d % 8;
            num = ((rem) * (int)Math.pow(8, ex));
            dec +=  num;
            d = d / 8;
            ex++;
         }
         convBin(dec);
    }

    public void convBin(int d)
    {
        
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