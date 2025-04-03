import java.util.Scanner;

public class CostOfThings {
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pencil cost = ");
        float pencil = sc.nextFloat();

        System.out.print("Pen cost = ");
        float pen = sc.nextFloat();

        System.out.print("Eraser cost = ");
        float eraser = sc.nextFloat();

        // total cost
        float totalCostOfThings = (pencil + pen + eraser);
        System.out.println("User Bill is = " + totalCostOfThings);

        // again total cost with 18% GST tax
        float withTaxTheTotalBill = totalCostOfThings + (0.18f * totalCostOfThings);
        System.out.println("With GST Tax the user bill is = " + withTaxTheTotalBill);
    }
}
