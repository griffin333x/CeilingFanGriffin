package com.griffin.ceilingfangriffin;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class used to interact with the fan.
 */
public class Main {
    public static void main(String[] args) {
        // Create a new CeilingFan object
        CeilingFan fan = new CeilingFan();
        // Check if it's Christmas
        if (fan.isChristmasDay()) {
            System.out.println("It's Christmas! There's no need for the fan today.");
            return;
        }
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Display the current speed and direction of the fan and the options to change them
            System.out.println("Current speed: " + fan.getSpeed());
            System.out.println("Current direction: " + fan.getDirection());
            System.out.println("1. Pull speed cord");
            System.out.println("2. Pull direction cord");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            try {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> fan.speedCord();
                case 2 -> fan.directionCord();
                case 3 -> { 
                    System.out.println("Thanks for using the Ceiling Fan!");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice, please enter 1, 2, or 3.");
            }
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice, please enter 1, 2, or 3.");
                scanner.nextLine();
            }
        }

    }
}
