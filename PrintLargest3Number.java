public class PrintLargest3Number {
    public static void main(String[] args) {
        int A = 1, B = 3, C = 6;

        if((A >= B) && (A >= C)) {
            System.out.print("Largest is A");
        } else if (B >= C) {
            System.out.print("Largest is B");
        } else {
            System.out.println("Largest is C");
        }
    }
}
