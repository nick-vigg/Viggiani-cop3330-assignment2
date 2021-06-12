/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Viggiani
 Exercise 38 - Filtering Values
Sometimes input you collect will need to be filtered down. Data structures and loops can make this process easier.

Create a program that prompts for a list of numbers, separated by spaces.
Have the program print out a new list containing only the even numbers.

Example Output
Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.
Constraints
Convert the input to an array. Many languages can easily convert strings to
arrays with a built-in function that splits apart a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this.
The function takes in the old array and returns the new array.
 */
package ex38;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilteringValues {
    private static final Scanner input = new Scanner(System.in);

    public static char[] stringToArray(String numString){
        return numString.toCharArray();
    }

    public static List<Character> filterEvenNumbers(char[] numArr){
        List<Character> evenNumList = new ArrayList<>();
        for (int i = 0; i < numArr.length; i++){
            if (Character.getNumericValue(numArr[i])%2 == 0){
                evenNumList.add(numArr[i]);
            }
        }
        return evenNumList;
    }
    public static void output(List<Character> evenNumList){
        System.out.print("The even numbers are ");
        for (int i = 0; i < evenNumList.size(); i++){
            System.out.print(String.format("%c ", evenNumList.get(i)));
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a list of numbers, separated by spaces: ");
        String numString = input.nextLine();
        output(filterEvenNumbers(stringToArray(numString)));
    }
}
