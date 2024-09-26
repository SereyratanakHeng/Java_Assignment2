package Assignment2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class ascendingOrder {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Create an array to store 5 integers
        int[] numbers = new int[5];
        
        // Variable to track the number of valid inputs entered
        int count = 0;

        // Prompt the user to enter 5 positive integers
        System.out.println("Please enter 5 positive integers:");

        // Loop to take input until 5 valid integers are entered
        while (count < 5) {
            System.out.printf("Enter integer #%d: ", count + 1);

            try {
                // Capture user input
                int user_input = input.nextInt();

                // Check if the input is a negative number
                if (user_input < 0) {
                    // If the input is negative, prompt the user to enter a positive integer
                    System.out.println("Invalid input. Please enter only a positive integer.");
                } else {
                    // If the input is valid, store it in the array and move to the next input
                    numbers[count] = user_input;
                    count++;
                }

            } catch (InputMismatchException e) {
                // Catch block for invalid input (non-integer values)
                System.out.println("Invalid input. String and characters are not allowed. Please enter a valid positive integer.");
                
                // Clear the invalid input from the scanner buffer
                input.next();
            }
        }

        // Sort the array in ascending order using Arrays.sort()
        Arrays.sort(numbers);

        // Display the sorted integers
        System.out.println("The 5 integers in ascending order: " + Arrays.toString(numbers));

        // Close the Scanner object to avoid resource leakage
        input.close();
    }
}
