package com.guess.movie;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public void guessingTheMovieGame(String selectedMovie) {
        //we need a variable to keep count of the guesses
        int numOfWrongGuesses = 0;
        //an integer variable that acts as a toggle for correct guesses
        int flag = 0;
        String movieTitle=selectedMovie.replaceAll("\\s","");
        //masking the randomly selected movie title, initiating the guessing game
        String maskedTitle = movieTitle.replaceAll(".", "_");
        //for convenience, a character array from the movie title string
        char[] maskCharArray = maskedTitle.toCharArray();

        while (numOfWrongGuesses < 10) {
            System.out.println("You are guessing: " + maskedTitle);
            System.out.println("You have guessed (" + numOfWrongGuesses + ") wrong letters:");
            System.out.print("Guess a letter: ");

            Scanner sc2 = new Scanner(System.in);
            char guessInputChar = sc2.nextLine().charAt(0);

            //scan through the movie title string to find match
            for(int i = 0; i < movieTitle.length(); i++){
                if(movieTitle.charAt(i) == guessInputChar){
                    maskCharArray[i] = guessInputChar;
                    flag++;
                }
            }

            //modifying the masked string, inserting the correctly guessed characters
            maskedTitle = String.valueOf(maskCharArray);

            if(flag == 0){
                numOfWrongGuesses++;
            }

            else{
                flag = 0;
                if(maskedTitle.contains("_")){
                    continue;
                }
                else{
                    break;
                }
            }

        }

        //notifying the users if they won or loss
        //win if they can guess all characters correctly
        //lose if they could not guess after 10 chances
        if (numOfWrongGuesses < 10) {
            System.out.println("You win!");
            System.out.println("You have guessed '" + selectedMovie + "' correctly.");
        } else {
            System.out.println("Sorry, you have lost.");
            System.out.println("The name of the movie is '" + selectedMovie + "'.");
        }
    }

}