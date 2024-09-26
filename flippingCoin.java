package Assignment2;

import java.util.Random;

public class flippingCoin {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        Random random = new Random();

        // Simulate flipping the coin 1 million times
        for (int i = 0; i < 1000000; i++) {
            if (random.nextBoolean()) {
                heads++;
            } else {
                tails++;
            }
        }

        // Display the results
        System.out.println("Number of heads: " + heads);
        System.out.println("Number of tails: " + tails);
    }
}

