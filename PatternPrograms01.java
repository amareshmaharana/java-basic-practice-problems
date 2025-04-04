public class PatternPrograms01 {
    public static void main(String[] args) {

        /*  01-PATTERN - STAR PRINT 01
            *
            **
            ***
            ****
        */
        System.out.println("Printed star pattern is :");
        for(int line=1; line<=4; line++) {
            for(int star=1; star<=line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();



        /* 02-PATTERN - INVERTED STAR PRINT 02
            ****
            ***
            **
            *
        */
        int n = 4;
        System.out.println("Printed inverted star pattern is :");
        for(int line=1; line<=n; line++) {
            for(int star=1; star<=n-line+1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();



        /* 03-PATTERN - HALF PYRAMID PRINT 01
            1
            12
            123
            1234
        */
        System.out.println("Printed half pyramid pattern is :");
        for (int i=1; i<=4; i++) {          // here i is line
            for(int j=1; j<=i; j++) {       // here j is number
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();



        /* 04-PATTERN - CHARACTER PRINT 01
            A
            BC
            DEF
            GHIJ
        */
        char ch = 'A';
        System.out.println("Printed character pattern is :");
        for (int i=1; i<=4; i++) {
            for(int chars=1; chars<=i; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
