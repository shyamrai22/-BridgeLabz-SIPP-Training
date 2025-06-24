package Built_In_Methods;

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");
        startGame();
    }

    public static void startGame() {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        boolean found = false;

        while (!found && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter: high / low / correct)");
            String feedback = getUserFeedback(sc);

            switch (feedback) {
                case "low":
                    low = guess + 1;
                    break;
                case "high":
                    high = guess - 1;
                    break;
                case "correct":
                    System.out.println("Hooray! I guessed your number: " + guess);
                    found = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }

        if (!found) {
            System.out.println("Hmm, something went wrong. Are you sure you gave correct feedback?");
        }
    }

    public static int generateGuess(int low, int high) {
        return low + (high - low) / 2; 
    }

    public static String getUserFeedback(Scanner sc) {
        return sc.next().trim().toLowerCase();
    }
}
