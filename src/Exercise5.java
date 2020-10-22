import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a grade: ");
        double grade = in.nextDouble();
        in.close();

        if (grade > 100) {
            System.out.println("\nGrades above 100 are invalid.");
        } else if (grade < 0) {
            System.out.println("\nGrades below 0 are invalid.");
        } else {
            grade = Math.round(grade);

            if (grade >= 90) {
                System.out.println("\nYou received an A.");
            } else if (grade >= 80) {
                System.out.println("\nYou received a B.");
            } else if (grade >= 70) {
                System.out.println("\nYou received a C.");
            } else if (grade >= 60) {
                System.out.println("\nYou received a D.");
            } else {
                System.out.println("\nYou received an F.");
            }
        }
    }
}
