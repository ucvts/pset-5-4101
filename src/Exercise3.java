import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three integers.\n");
        System.out.print("Enter integer: ");
        int first = in.nextInt();
        System.out.print("Enter integer: ");
        int second = in.nextInt();
        System.out.print("Enter integer: ");
        int third = in.nextInt();
        in.close();

        if (first == second && second == third) {
            System.out.println("\nSame.");
        } else if (first < second && second < third) {
            System.out.println("\nStrictly increasing.");
        } else if (first <= second && second <= third) {
            System.out.println("\nIncreasing.");
        } else if (first > second && second > third) {
            System.out.println("\nStrictly decreasing.");
        } else if (first >= second && second >= third) {
            System.out.println("\nDecreasing.");
        } else {
            System.out.println("\nUnordered.");
        }
    }
}
