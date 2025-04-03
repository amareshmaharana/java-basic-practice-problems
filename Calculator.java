import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no.: ");
        int firstNo = sc.nextInt();

        System.out.print("Enter 2nd no.: ");
        int secondNo = sc.nextInt();

        System.out.print("select a operator ('+', '-', '*', '/', '%') : ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.print("Ans of addition is : ");
                System.out.println(firstNo + secondNo);
                break;
            case '-':
                System.out.print("Ans of subtraction is : ");
                System.out.println(firstNo - secondNo);
                break;
            case '*':
                System.out.print("Ans of multiplication is : ");
                System.out.println(firstNo * secondNo);
                break;
            case '/':
                System.out.print("Ans of divide is : ");
                System.out.println(firstNo / secondNo);
                break;
            case '%':
                System.out.print("Ans of modulo is : ");
                System.out.println(firstNo % secondNo);
                break;
            default:
                System.out.println("ERROR : Invalid operator!!!");
        }
    }
}
