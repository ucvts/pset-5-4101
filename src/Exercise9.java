import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String month = in.nextLine().toLowerCase();
        in.close();

        switch (month) {
            case "feb"      : // intentionally fall through to "february"
            case "febr"     : // intentionally fall through to "february"
            case "february" : System.out.println("\n28 or 29 days."); break;
            case "apr"      : // intentionally fall through to "november"
            case "apri"     : // intentionally fall through to "november"
            case "april"    : // intentionally fall through to "november"
            case "jun"      : // intentionally fall through to "november"
            case "june"     : // intentionally fall through to "november"
            case "sep"      : // intentionally fall through to "november"
            case "sept"     : // intentionally fall through to "november"
            case "september": // intentionally fall through to "november"
            case "nov"      : // intentionally fall through to "november"
            case "nove"     : // intentionally fall through to "november"
            case "november" : System.out.println("\n30 days."); break;
            case "jan"      : // intentionally fall through to "december"
            case "janu"     : // intentionally fall through to "december"
            case "january"  : // intentionally fall through to "december"
            case "mar"      : // intentionally fall through to "december"
            case "marc"     : // intentionally fall through to "december"
            case "march"    : // intentionally fall through to "december"
            case "may"      : // intentionally fall through to "december"
            case "jul"      : // intentionally fall through to "december"
            case "july"     : // intentionally fall through to "december"
            case "aug"      : // intentionally fall through to "december"
            case "augu"     : // intentionally fall through to "december"
            case "august"   : // intentionally fall through to "december"
            case "oct"      : // intentionally fall through to "december"
            case "octo"     : // intentionally fall through to "december"
            case "octoboer" : // intentionally fall through to "december"
            case "dec"      : // intentionally fall through to "december"
            case "dece"     : // intentionally fall through to "december"
            case "december" : System.out.println("\n31 days."); break;
            default: System.out.println("\nThat's not a valid month."); break;
        }
    }
}
