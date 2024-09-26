package Assignment2;

import java.util.Random;
import java.util.Scanner;

public class scissorRockPaper {

    public static void main(String[] args) {
        // Scanner for user input
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        // Variables to track the number of wins
        int userWins = 0;
        int computerWins = 0;

        // Game loop continues until one wins 3 times
        while (userWins < 3 && computerWins < 3) {
            // Get user choice
            System.out.print("Enter your move (0-Scissors, 1-Rock, 2-Paper): ");
            int userChoice = input.nextInt();

            // Check if the input is valid
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid input. Please enter 0, 1, or 2.");
                continue;
            }

            // Generate computer's move (randomly 0, 1, or 2)
            int computerChoice = random.nextInt(3);

            // Convert user and computer choices to strings
            String userMove = (userChoice == 0) ? "Scissors" : (userChoice == 1) ? "Rock" : "Paper";
            String computerMove = (computerChoice == 0) ? "Scissors" : (computerChoice == 1) ? "Rock" : "Paper";

            // Display choices
            System.out.println("You chose: " + userMove);
            System.out.println("Computer chose: " + computerMove);

            // Determine the result
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) || // Scissors beats Paper
                       (userChoice == 1 && computerChoice == 0) || // Rock beats Scissors
                       (userChoice == 2 && computerChoice == 1)) { // Paper beats Rock
                System.out.println("You win this round!");
                userWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }

            // Display the current score
            System.out.println("Current Score: You " + userWins + " - " + computerWins + " Computer");
        }

        // Announce the overall winner
        if (userWins == 3) {
            System.out.println("Congratulations! You won the game.");
        } else {
            System.out.println("Sorry, the computer won the game.");
        }
        
        input.close(); // Close the scanner
    }
}