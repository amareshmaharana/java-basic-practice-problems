import java.util.Scanner;

public class AverageNos {
    public  static void main(String[] args) {
        // using 1st method
//        int A = 23;
//        int B = 45;
//        int C = 18;
//        float averageNo = (A + B + C)/3f;
//        System.out.println("Average no. is : " + averageNo);

        // using scanner mean user input method (2nd)
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int A = sc.nextInt();
        System.out.println("B = ");
        int B = sc.nextInt();
        System.out.println("C = ");
        int C = sc.nextInt();

        float averageNo = (A + B + C)/3f;
        System.out.println("Average no. is : " + averageNo);
    }
}
