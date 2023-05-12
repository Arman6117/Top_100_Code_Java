// Java program to convert hexadecimal values into decimal

import java.util.Scanner;

public class HexaDecimal_To_Decimal {

    public static void main(String[] args) {
        int v = 0;
        String hex;
        Scanner in = new Scanner(System.in);
     
        System.out.println("Enter a HexaDecimal Number: ");
        hex =  in.nextLine();

        Sol obj = new Sol();
        v = obj.convertHex("c9");

        System.out.println("The conversion of hexadecimal number "+ hex +" is "+v);
        
    }
    
}

class Sol
{
    public static int convertHex(String Hex)
    {
        String digits = "0123456789ABCDEF";  
        int val = 0;
        Hex = Hex.toUpperCase();
        for(int i = 0;i<Hex.length();i++)
        {
            char c = Hex.charAt(i);
            int d =  digits.indexOf(c);
            val = val*16 + d;
        }
        return val;
    }
}