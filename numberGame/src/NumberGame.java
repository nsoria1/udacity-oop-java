/*
 * This java program will throw a random number and user will have to guess it.
 * It will import the scanner library.
 *
 */

import java.util.Scanner;

public class NumberGame {
    public static void main(String [] args) {
        int randomNumber = (int) (Math.random() * 100 + 1);
        boolean hasWon = false;

        System.out.println("I have randomly chosen a number between 1 a 100.");
        System.out.println("Try to guess it.");

        Scanner scanner = new Scanner(System.in);
        for (int i = 5; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left. Choose again.");
            int guess = scanner.nextInt();

            if (randomNumber < guess) {
                System.out.println("It is smaller than " + guess + " guess.");
            }
            else if (randomNumber > guess) {
                System.out.println("It is greater than " + guess + " guess.");
            }
            else if (randomNumber == guess) {
                hasWon = true;
                break;
            }
        }

            if(hasWon) {
                System.out.println("Correct! You win!");
            } else {
                System.out.println("Wrong, you've loose!");
                System.out.println("The correct number was: " + randomNumber);
            }
        }
    }