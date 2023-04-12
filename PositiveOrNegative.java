import java.util.Scanner;

// Check  if number is positive or negative

class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter a number");
        number = in.nextInt();
        Sol obj = new Sol();
        boolean ans = obj.checkNum(number);
        System.out.println(ans ? number + " is a positive number" : number + " is a negative number");
    }
}

class Sol {
    public boolean checkNum(int a) {
        if (a < 0) {
            return false;
        } else {
            return true;
        }
    }
}