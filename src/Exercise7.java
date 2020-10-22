import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = in.nextInt();
        in.close();

        boolean leapYear = (year % 4 == 0);
        leapYear = leapYear && (year % 100 != 0);
        leapYear = leapYear || (year % 400 == 0);

        System.out.printf("\n%d is%s a leap year.\n", year, (leapYear ? "" : " not"));
    }
}
