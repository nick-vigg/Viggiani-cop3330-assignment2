/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Viggiani
 Exercise 33 - Magic 8 Ball
Arrays are great for storing possible responses from a program.
If you combine that with a random number generator, you can pick a random entry from this list,
which works great for games.

Create a Magic 8 Ball game that prompts for a question and then displays either
"Yes," "No," "Maybe," or "Ask again later."

Example Output
What's your question?
> Will I be rich and famous?

Ask again later.
Constraint
The value should be chosen randomly using a pseudo random number generator.
Store the possible choices in a list and select one at random.
 */
package ex33;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Magic8Ball {
    private static final Scanner input = new Scanner(System.in);

    public static Object Answer(List<String> values, int rand) {
        if (rand == 1) {
            return values.get(0);
        } else if (rand == 2) {
            return values.get(1);
        } else if (rand == 3) {
            return values.get(2);
        } else if (rand == 4) {
            return values.get(3);
        }
        return -1;
    }


    public static void main(String[] args) {
        List<String> values = Arrays.asList("Yes", "No", "Maybe", "Ask again later.");
        int rand = (int) Math.ceil(Math.random() * 4);
        System.out.println("What's your question?");
        String question = input.next();
        System.out.println(Answer(values, rand));
    }
}
