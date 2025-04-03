import java.util.*;

public class AreaOfCircle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the radius of the circle: ");
            int radius = sc.nextInt();
            float pi = 3.14F;

            float area = pi * radius * radius;
            System.out.printf("The area of the circle with radius %d is %.2f%n", radius, area);
        }
}
