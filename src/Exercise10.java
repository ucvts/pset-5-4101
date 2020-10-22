import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter wage: ");
        double wage = in.nextDouble();
        System.out.print("Enter hours worked: ");
        double hours = in.nextDouble();
        double pay = 0;
        in.close();

        if (wage < 0) {
            System.out.println("\nYour wage must be greater than or equal to $0.00/hour.");
        } else if (hours < 0) {
            System.out.println("\nYour hours must be greater than or equal to 0.0.");
        } else {
            pay = hours * wage;

            if (hours > 40) {
                pay = pay + (hours - 40) * (wage * 0.5);
            }

            System.out.printf("\nYou'll make $%,.2f this week.\n", pay);
        }
    }
}
