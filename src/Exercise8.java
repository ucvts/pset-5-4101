import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        String s = in.nextLine().toUpperCase();
        double temperature = Double.parseDouble(s.substring(0, s.indexOf(" ")));
        String scale = s.substring(s.indexOf(" ") + 1);
        in.close();

        switch (scale) {
            case "C":
                if (temperature >= 100) {
                    System.out.println("\nGas.");
                } else if (temperature > 0) {
                    System.out.println("\nLiquid.");
                } else {
                    System.out.println("\nSolid.");
                }
                break;
            case "F":
                if (temperature >= 212) {
                    System.out.println("\nGas.");
                } else if (temperature > 32) {
                    System.out.println("\nLiquid.");
                } else {
                    System.out.println("\nSolid.");
                }
                break;
            default: System.out.println("\nThat's not a valid scale."); break;
        }
    }
}
