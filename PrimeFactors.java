import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
        int n = 90;
        Sol obj = new Sol();
        obj.checkFact(n);
    }
}

class Sol {
    public boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void checkFact(int A) {
        for (int i = 2; i <= A; i++) {
            if (A % i == 0 && checkPrime(i)) {
                System.out.print(i + ",");
            }
        }
    }
}
