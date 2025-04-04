import java.util.Scanner;

public class FunctionPrograms {

    /* PRODUCT BETWEEN A & B */
    public static void productResult(int a, int b) {
        int product = a * b;
        System.out.println("Product is : " + product);
    } // work at main func (go)


    /* FACTORIAL NUMBER */
    public static int factorial(int n) {
        int f = 1;

        for (int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    } // work at main func (go)


    /* BINOMIAL COEFFICIENT */
    public static int binomialCoefficient(int o, int r) {
        int n_fact = factorial(o);
        int r_fact = factorial(r);
        int nmr_fact = factorial(o-r);

        int result = n_fact / (r_fact * nmr_fact);
        return result;
    } // work at main func (go)


    /* PRIME NUMBER */
    public static boolean primeNumber(int p) {
        boolean isPrime = true;

        for(int i=2; i<=Math.sqrt(p); i++) {   // after optimizing the i<=n-1 to i<=Math.sqrt(n)
            if(p % 2 == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    } // work at main func (go)


    /* RANGE IN PRIME NOS */
    public static void rangeOfPrime(int c) {
        for(int i=2; i<=c; i++) {
            if(primeNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // FOR PRODUCT - a * b
        System.out.println("(1) PRODUCT/MULTIPLE :-");
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        productResult(a, b);
        System.out.println();


        // FOR FACTORIAL - n!
        System.out.println("(2) FACTORIAL NO. :-");
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Factorial is : " + factorial(n));
        System.out.println();


        // FOR BINOMIAL COEFFICIENT / COMBINATION - n! / r! * (n-r)!
        System.out.println("(3) BINOMIAL COEFFICIENT :-");
        System.out.print("Enter o : ");
        int o = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();

        System.out.println("Binomial Coefficient is : " + binomialCoefficient(o, r));
        System.out.println();


        // PRIME NUMBER - (n % 2 == 0) <- when it false the no. is prime
        System.out.println("(4) PRIME NUMBER :-");
        System.out.print("Enter p : ");
        int p = sc.nextInt();

        System.out.println("is it prime number? : " + primeNumber(p));
        System.out.println();


        // PRINTING PRIME NOS IN A RANGE - (example) n = 10 (range)
        System.out.println("(5) PRIME NO. IN A RANGE :-");
        System.out.print("Enter c : ");
        int c = sc.nextInt();

        System.out.print("Range in prime nos : ");
        rangeOfPrime(c);
        System.out.println();


        // BINARY TO DECIMAL - binary (1 or 0 as ex - 101110)  into decimal (ex - 1.0)
        System.out.println("(6) BINARY TO DECIMAL :-");
        System.out.print("Enter d : ");
        int d =sc.nextInt();
    }
}
