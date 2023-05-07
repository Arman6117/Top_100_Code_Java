
// Java program to check friendly pair or not
import java.util.Scanner;

class FriendlyPair {
    public static void main(String[] args) {

        int no1 = 0, no2 = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        no1 = in.nextInt();
        no2 = in.nextInt();

        Sol obj = new Sol();
        obj.checkNum(no1, no2);

        in.close();
    }
}

class Sol {
    public int factSum(int N) {
        int sum = 0;

        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }

        return sum;

    }

    public void checkNum(int A, int B) {
        
        int SumA = 0, SumB = 0;
        SumA = factSum(A);
        SumB = factSum(B);

        if (A == SumA && B == SumB) {

            if (SumA /A ==  SumB / B ) {
                System.out.println(A + " and " + B + " are friendly pair");
            }
        } else {
            System.out.println(A + " and " + B + " are not friendly pair");

        }
        

    }
}

// Input : 6 28
// Output : Yes, they are a friendly pair
// Explanation : The factors of 6 and 28 except the numbers themselves are 1, 2,
// 3 and 1, 2, 4, 7, 14 respectively.
// Now the sum of factors of both the numbers are 6 and 28 respectively.
// When we divide the sums with the numbers we get 1 and 1 respectively.
// As the ratio of both the number match, they are considered as a friendly
// pair.