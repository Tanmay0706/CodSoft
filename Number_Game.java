import java.util.Random;
import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String plagain;

        do {
            int numGuess = ran.nextInt(100) + 1;
            int trial = 5;
            boolean GuessCorrectly = false;

            System.out.println("\n\tWelcome to the Number Game!");
            System.out.println("\n*Guess a number between 1 and 100. \n*You have " + trial + " trials.");

            for (int i = 0; i < trial; i++) {
                System.out.print("\nEnter your guess: \t");
                int userGuess = sc.nextInt();

                if (userGuess == numGuess) {
                    System.out.println("\n\tCongratulations! You guessed the number correctly.");
                    GuessCorrectly = true;
                    break;
                } else if (userGuess < numGuess) {
                    System.out.println("\n\tThe number is greater than " + userGuess + ". \n\tTry again.");
                } else {
                    System.out.println("\n\tThe number is less than " + userGuess + ". \n\tTry again.");
                }
            }

            if (!GuessCorrectly) {
                System.out.println("\n\tYou have used all your trials. \n\tThe number was:\t " + numGuess);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            plagain = sc.next();

        } while (plagain.equalsIgnoreCase("yes"));

        System.out.println("\n\tThank you for playing the Number Game!");
        sc.close();
    }
}



   
