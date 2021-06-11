/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Viggiani
 Exercise 37 - Password Generator
Coming up with a password that meets specific requirements is something your computer can do. And it will give you practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password. Prompt the user for the minimum length, the number of special characters, and the number of numbers. Then generate a password for the user using those inputs.

Example Output
What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#
Constraints
Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.
 */
package ex37;


import java.util.Scanner;

public class PasswordGenerator {
    private static final Scanner input = new Scanner(System.in);
    final static String setOfChars = "abcdefghijklmnopqrstuvwxyz";
    final static String setOfSpecChars = "@#$%^&*!?><";
    final static String setOfNums = "1234567890";

    public static char[] addNums(char[] password, int numChars) {
        for (int i = 0; i < numChars; i++) {
            int j = (int) (Math.random() * password.length);
            if (password[j] == 0) {
                password[j] = setOfNums.charAt((int) (Math.random() * password.length));
            } else {
                numChars+=1;
            }
        }
        return password;
    }
    public static char[] addSpec(char[] password, int specChars) {
        for (int i = 0; i < specChars; i++) {
            int j = (int) (Math.random() * password.length);
            if ((password[j] == 0)) {
                password[j] = setOfSpecChars.charAt((int) (Math.random() * password.length));
            } else {
                specChars+=1;
            }
        }
        return password;
    }
    public static char[] addChars(char[] password, int numChars, int specChars) {
        int length = password.length-numChars-specChars;
        for (int i = 0; i < (length); i++) {
            int j = (int) (Math.random() * password.length);
            if (password[j] == 0) {
                password[j] = setOfChars.charAt((int) (Math.random() * password.length));
            } else {
                length+=1;
            }
        }
        return password;
    }
    public static char[] finalPassword(char[] password, int numChars, int specChars){
        addNums(password, numChars);
        addSpec(password, specChars);
        addChars(password, numChars, specChars);
        return password;
    }
    public static String passwordToString(char[] password){
        return String.valueOf(password);
    }

    public static void main(String[] args) {
        System.out.println("What's the minimum length?");
        int minLength = input.nextInt();
        System.out.println("How many special characters?");
        int specChars = input.nextInt();
        System.out.println("How many numbers?");
        int numChars = input.nextInt();
        char[] password = new char[minLength];
        System.out.println(String.format("Your password is %s",
                passwordToString(finalPassword(password, numChars, specChars))));

    }
}
