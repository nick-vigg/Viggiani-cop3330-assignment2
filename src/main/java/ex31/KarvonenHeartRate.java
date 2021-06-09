/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Viggiani
Exercise 31 - Karvonen Heart Rate
When you loop, you can control how much you increment the counter;
you don’t always have to increment by one.

When getting into a fitness program, you may want to figure out your target heart rate
so you don’t overexert yourself.
The Karvonen heart rate formula is one method you can use to determine your rate.
Create a program that prompts for your age and your resting heart rate.
Use the Karvonen formula to determine the target heart rate based on a range of intensities
from 55% to 95%. Generate a table with the results as shown in the example output.
The formula is:
*
TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR


* Example Output
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm
Constraints
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
Display the results in a tabular format.
 */
package ex31;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class KarvonenHeartRate {
    private static final Scanner input = new Scanner(System.in);

    public static int Age(){
        System.out.println("What is your age?");
        return input.nextInt();
    }

    public static int RestingHeartRate(){
        System.out.println("What is your resting heart rate?");
        return input.nextInt();
    }

    public static void TargetHeartRate(){
        int age = Age();
        int rhr = RestingHeartRate();
        int thr;
        System.out.println("Resting Pulse: " + rhr + "          Age: " + age);
        System.out.println();
        System.out.println("Intensity    | Rate");
        System.out.println("--------------------");
        for(int i = 55; i<= 95; i+=5){
            thr = (int) Math.ceil((((220 - age) - rhr) * i/100) + rhr);
            System.out.println(String.format("%d%%          | %d bpm", i, thr));
            thr = 0;
        }
    }

    public static void main(String[] args) {
        TargetHeartRate();
    }
}

