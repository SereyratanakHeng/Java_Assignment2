package Assignment2;

import java.util.Scanner;

public class currencyExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount, result;
        int option;

        // Exchange rates
        final double DOLLAR_TO_RIEL = 4100;
        final double RIEL_TO_DOLLAR = 0.00025;

        // Prompt user for input
        System.out.println("Currency Converter Menu:");
        System.out.println("Enter 0 to convert Dollars to Riel (1$ = 4,100 Riel)");
        System.out.println("Enter 1 to convert Riel to Dollars (1Riel = 0.00025$)");
        System.out.print("Enter your choice: ");
        
        try {
            option = input.nextInt();  // Read user choice

            if (option < 0 || option > 2) {
                System.out.println("Invalid option. Please enter a number between 0 and 2.");
                System.exit(option);
            }

            System.out.print("Enter the amount you want to convert: ");
            amount = input.nextDouble();  // Read the amount

            if (amount < 0) {
                System.out.println("Invalid input. Please enter a positive amount.");
                System.exit(option);
            }

            switch (option) {
                case 0: // Dollars to Riel
                    result = amount * DOLLAR_TO_RIEL;
                    System.out.printf("%.2f USD is equal to %.2f Riel.\n", amount, result);
                    break;
                case 1: // Riel to Dollars
                    result = amount * RIEL_TO_DOLLAR;
                    System.out.printf("%.2f Riel is equal to %.2f USD.\n", amount, result);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } 
        input.close();
    }
}

