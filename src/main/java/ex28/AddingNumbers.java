/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Viggiani
 *
Exercise 28 - Adding Numbers
In previous programs, you asked the user for repeated input by writing the input statements multiple times. But it’s more efficient to use loops to deal with repeated input.

Write a program that prompts the user for five numbers and computes the total of the numbers.

Example Output
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.
Constraints
The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.

 */
package ex28;

import java.util.Scanner;

public class AddingNumbers {
    private static final Scanner input = new Scanner(System.in);

    public static String Counter(int total){
        int num, sum = 0;
        for(int i =0; i < total; i++){
            System.out.println("Enter a number:");
            num = input.nextInt();
            sum+=num;
        }
        return "The total is " + sum;

    }
    public static void main(String[] args) {
        System.out.println("How many numbers would you like to add?");
        int total = input.nextInt();
        System.out.println(Counter(total));

    }
}
