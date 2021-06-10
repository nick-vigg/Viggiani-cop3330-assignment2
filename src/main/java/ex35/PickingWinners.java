/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Viggiani
 Exercise 35 - Picking a Winner
Arrays don’t have to be hard-coded. You can take user input and store it in an array
and then work with it.

Create a program that picks a winner for a contest or prize drawing.
Prompt for names of contestants until the user leaves the entry blank. Then randomly select a winner.

Example Output
Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.
Constraints
Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time.
You may need to find another data structure, like an ArrayList.
 */
package ex35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickingWinners {
    private static final Scanner input = new Scanner(System.in);

    public static List<String> arrayAssembly(List<String> names){
        System.out.println("Enter a name: ");
        String name = input.nextLine();
        while (!name.equals("")){
            names.add(name);
            System.out.println("Enter a name: ");
            name = input.nextLine();
        }
        return names;
    }
    public static String Winner(List<String> names){
        int rand = (int) Math.ceil(Math.random()*names.size());
        return String.format("The winner is... %s.", names.get(rand));
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        System.out.println(Winner(arrayAssembly(names)));
    }
}
