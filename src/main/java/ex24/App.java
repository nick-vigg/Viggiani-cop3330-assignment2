/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Viggiani
 *
Exercise 24 - Anagram Checker
Using functions to abstract the logic away from the rest of your code makes it
easier to read and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams.
The program should prompt for both input strings and display the output as shown in the example
that follows.

Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.
Constraints
Implement the program using a function called isAnagram, which takes in two words as its arguments
and returns true or false.
Invoke this function from your main program.
Check that both words are the same length.
 */
package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string: ");
        String firstString = input.nextLine();
        System.out.println("Enter the second string: ");
        String secondString = input.nextLine();
        if (isAnagram(firstString, secondString)){
            System.out.println('"'+firstString+'"'+ " and "+'"'+secondString+'"'+ " are anagrams.");
        } else {
            System.out.println('"'+firstString+'"'+ " and "+'"'+secondString+'"'+ " are not anagrams.");
        }

    }

    private static boolean isAnagram(String firstString, String secondString) {
        if(firstString.length() != secondString.length()){
            return false;
        } else {
            char[] firstArray = firstString.toLowerCase().toCharArray();
            char[] secondArray = secondString.toLowerCase().toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            return Arrays.equals(firstArray, secondArray);
        }
    }
}
