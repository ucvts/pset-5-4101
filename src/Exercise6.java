import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a playing card: ");
        String card = in.nextLine().toUpperCase();
        in.close();

        if (card.length() == 2) {
            char rank = card.charAt(0);
            char suit = card.charAt(1);
            String message = "\n";

            switch (rank) {
                case '2': message = message + "Two"; break;
                case '3': message = message + "Three"; break;
                case '4': message = message + "Four"; break;
                case '5': message = message + "Five"; break;
                case '6': message = message + "Six"; break;
                case '7': message = message + "Seven"; break;
                case '8': message = message + "Eight"; break;
                case '9': message = message + "Nine"; break;
                case 'T': message = message + "Ten"; break;
                case 'J': message = message + "Jack"; break;
                case 'Q': message = message + "Queen"; break;
                case 'K': message = message + "King"; break;
                case 'A': message = message + "Ace"; break;
                default: message = "That's not a valid rank."; break;
            }

            if (!message.equals("\nThat's not a valid rank.")) {
                switch (suit) {
                    case 'C': message = message + " of Clubs."; break;
                    case 'D': message = message + " of Diamonds."; break;
                    case 'H': message = message + " of Hearts."; break;
                    case 'S': message = message + " of Spades."; break;
                    default: message = "\nThat's not a valid suit."; break;
                }
            }

            System.out.println(message);
        } else {
            System.out.println("\nThat's not a valid card.");
        }
    }
}
