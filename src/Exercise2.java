import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = in.nextInt();
        in.close();

        if (integer % 2 == 0) {
            System.out.println("\nEven.");
        } else {
            System.out.println("\nOdd.");
        }
    }
}
