import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        boolean isPrime = true;

        for(int i=2; i<=Math.sqrt(n); i++) {   // after optimizing the i<=n-1 to i<=Math.sqrt(n)
            if (n % i == 0) {                  // n is a multiple of i (i not equal to 1 or n)
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("n is a prime no.");
        } else {
            System.out.println("n is not a prime no.");
        }
    }
}
