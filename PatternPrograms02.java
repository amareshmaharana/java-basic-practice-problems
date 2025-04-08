public class PatternPrograms02 {

    /* PATTERN 2.0 - 01 - HOLLOW RECTANGLE
        * * * *
        *     *
        *     *
        * * * *
    */
    public static void hollowRectangle(int totalRows, int totalCols) {
        // outer loop - for rows
        for (int i=1; i<=totalRows; i++) {
            // inner loop - for cols
            for (int j=1; j<=totalCols; j++) {
                // traversing in the stars (cell) - (i, j) - (rows, column)
                if (i == 1 || i == totalRows || j == 1 || j == totalCols) {
                    // boundary cell
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }


    /* PATTERN 2.0 - 02 - INVERTED & ROTATED HALF-PYRAMID
              *
            * *
          * * *
        * * * *
    */
    public static void invertedHalfPyramid(int n) {
        for (int line=1; line<=n; line++) {
            // for printing spaces
            for (int spaces=1; spaces<=n-line; spaces++) {
                System.out.print(" " + " ");
            }

            // for printing stars
            for (int star=1; star<=line; star++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


    /* PATTERN 2.0 - 03 - INVERTED & ROTATED HALF-PYRAMID WITH NUMBERS
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
    */
    public static void invertedHalfPyramidWithNumbers(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    /* PATTERN 2.0 - 04 - FLOYD'S TRIANGLE
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
    */
    public static void floydsTrianglePattern(int n) {
        int num = 1;
        for (int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }


    /* PATTERN 2.0 - 05 - (0-1) TRIANGLE
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
    */
    public static void zeroOneTriangle(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }


    /* PATTERN 2.0 - 06 - BUTTERFLY PATTERN
        *                    *
        *  *              *  *
        *  *  *        *  *  *
        *  *  *  *  *  *  *  *
        *  *  *  *  *  *  *  *
        *  *  *        *  *  *
        *  *              *  *
        *                    *
    */
    public static void butterflyPattern(int n) {

        // 1st half of pattern
        for (int i=1; i<=n; i++) {
            //stars - i
            for (int j=1; j<=i; j++) {
                System.out.print("*" + " ");
            }

            // spaces - 2 * (n-i)
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" " + " ");
            }

            //stars - i
            for (int j=1; j<=i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // 2nd half of pattern
        for (int i=n; i>=1; i--) {
            //stars - i
            for (int j=1; j<=i; j++) {
                System.out.print("*" + " ");
            }

            // spaces - 2 * (n-i)
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" " + " ");
            }

            //stars - i
            for (int j=1; j<=i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


    /* PATTERN 2.0 - 07 - SOLID RHOMBUS
                * * * * *
              * * * * *
            * * * * *
          * * * * *
        * * * * *
    */
    public static void rhombusPattern(int n) {
        for (int i=1; i<=n; i++) {
            //spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j=1; j<=n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


    /* PATTERN 2.0 - 08 - HOLLOW RHOMBUS
             *  *  *  *  *
           *           *
         *           *
       *           *
     *  *  *  *  *
     */
    public static void hollowRhombus(int n) {
        for (int i=1; i<=n; i++) {
            // for printing spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // for printing stars - hollow shaping (modifying hollow rectangle)
            for (int j=1; j<=n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }


    /* PATTERN 2.0 - 09 - DIAMOND PATTERN
              *
            * * *
          * * * * *
        * * * * * * *
        * * * * * * *
          * * * * *
            * * *
              *
    */
    public static void diamondPattern(int n) {
        // 1st half
        for (int i=1; i<=n; i++) {
            // spaces
            for (int j=1; j<=(n-i); j++) {
                System.out.print(" " + " ");
            }

            // stars
            for (int j=1; j<=(2*i)-1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // 2nd half
        for (int i=n; i>=1; i--) {
            // spaces
            for (int j=1; j<=(n-i); j++) {
                System.out.print(" " + " ");
            }

            // stars
            for (int j=1; j<=(2*i)-1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        // HOLLOW RECTANGLE
        System.out.println("(1) PRINTED HOLLOW RECTANGLE PATTERN IS :");
        hollowRectangle(4, 4);
        System.out.println();


        // INVERTED & ROTATED HALF-PYRAMID
        System.out.println("(2) PRINTED INVERTED & ROTATED HALF-PYRAMID PATTERN IS :");
        invertedHalfPyramid(4);
        System.out.println();


        // INVERTED & ROTATED HALF-PYRAMID WITH NUMBERS
        System.out.println("(3) PRINTED INVERTED & ROTATED HALF-PYRAMID WITH NUMBERS PATTERN IS :");
        invertedHalfPyramidWithNumbers(5);
        System.out.println();


        // FLOYD'S TRIANGLE PATTERN
        System.out.println("(4) PRINTED FLOYD'S TRIANGLE PATTERN IS :");
        floydsTrianglePattern(5);
        System.out.println();


        // 0-1 TRIANGLE PATTERN
        System.out.println("(5) PRINTED 0-1 TRIANGLE PATTERN IS :");
        zeroOneTriangle(5);
        System.out.println();


        // BUTTERFLY PATTERN
        System.out.println("(6) PRINTED BUTTERFLY PATTERN IS :");
        butterflyPattern(7);
        System.out.println();


        // SOLID RHOMBUS
        System.out.println("(7) PRINTED SOLID RHOMBUS PATTERN IS :");
        rhombusPattern(5);
        System.out.println();


        // HOLLOW RHOMBUS
        System.out.println("(8) PRINTED HOLLOW RHOMBUS PATTERN IS :");
        hollowRhombus(5);
        System.out.println();


        // DIAMOND PATTERN
        System.out.println("(9) PRINTED DIAMOND PATTERN IS :");
        diamondPattern(7);
    }
}
