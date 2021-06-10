/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Viggiani
Exercise 32 - Guess the Number Game
Write a Guess the Number game that has three levels of difficulty. The first level of difficulty would be a number between 1 and 10. The second difficulty set would be between 1 and 100. The third difficulty set would be between 1 and 1000.

Prompt for the difficulty level, and then start the game. The computer picks a random number in that range and prompts the player to guess that number. Each time the player guesses, the computer should give the player a hint as to whether the number is too high or too low. The computer should also keep track of the number of guesses. Once the player guesses the correct number, the computer should present the number of guesses and ask if the player would like to play again.

Example Output
Let's play Guess the Number!

Enter the difficulty level (1, 2, or 3): 1
I have my number. What's your guess? 5
Too low. Guess again: 7
Too low. Guess again: 9
You got it in 3 guesses!

Do you wish to play again (Y/N)? y

Enter the difficulty level (1, 2, or 3): 3
I have my number. What's your guess? 500
Too low. Guess again: 750
Too high. Guess again: 600
Too low. Guess again: 700
Too low. Guess again: 725
Too high. Guess again: 715
Too high. Guess again: 710
Too high. Guess again: 705
Too high. Guess again: 701
Too low. Guess again: 702
You got it in 10 guesses!

Do you wish to play again (Y/N)? n
Constraints
Don’t allow any non-numeric data entry.
During the game, count non-numeric entries as wrong guesses.

 */
package ex32;

import java.util.Scanner;

public class GuessTheNumberGame {
    private static final Scanner input = new Scanner(System.in);

    public static int Difficulty(){
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        int difficulty = input.nextInt();
        if(difficulty == 1){
            return 1;
        } else if (difficulty == 2){
            return 2;
        } else if (difficulty == 3){
            return 3;
        } else {
            System.out.println("Input incorrect, please try again.");
            return -1;
        }
    }
    public static void Easy(){
        int easy = (int) Math.ceil(Math.random()*10);
        int count = 1;
        System.out.println("I have my number. What's your guess?");
        int guess = input.nextInt();
        boolean win = false;
        while (win == false){
            if (easy == guess){
                System.out.println("You got it in " + count + " guesses.");
                win = true;
                toPlayAgain();
            }else if (easy < guess){
                System.out.println("Too high. Guess again:");
            } else if (easy > guess){
                System.out.println("Too low. Guess again:");
            }
            count++;
            guess = input.nextInt();

        }
    }
    public static void Medium(){
        int easy = (int) Math.ceil(Math.random()*100);
        int count = 1;
        System.out.println("I have my number. What's your guess?");
        int guess = input.nextInt();
        boolean win = false;
        while (win == false){
            if (easy == guess){
                System.out.println("You got it in " + count + " guesses.");
                win = true;
                toPlayAgain();
            }else if (easy < guess){
                System.out.println("Too high. Guess again:");
            } else if (easy > guess){
                System.out.println("Too low. Guess again:");
            }
            count++;
            guess = input.nextInt();

        }
    }
    public static void Hard(){
        int easy = (int) Math.ceil(Math.random()*1000);
        int count = 1;
        System.out.println("I have my number. What's your guess?");
        int guess = input.nextInt();
        boolean win = false;
        while (win == false){
            if (easy == guess){
                System.out.println("You got it in " + count + " guesses.");
                win = true;
                toPlayAgain();
            }else if (easy < guess){
                System.out.println("Too high. Guess again:");
            } else if (easy > guess){
                System.out.println("Too low. Guess again:");
            }
            count++;
            guess = input.nextInt();

        }
    }
    public static void toPlay(int difficulty){
        if (difficulty == 1){
            Easy();
        } else if (difficulty == 2){
            Medium();
        } else if (difficulty == 3){
            Hard();
        }
    }
    public static void toPlayAgain() {
        System.out.println("Do you wish to play again? (y/n)");
        String playAgain = input.next();
        if (playAgain.equals("y")) {
            toPlay(Difficulty());
        } else if (playAgain.equals("n")) {
            System.out.println("Thanks for playing!");
            System.exit(-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");
        toPlay(Difficulty());
    }
}
