/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Viggiani
Exercise 25 - Password Strength Indicator
        Functions help you abstract away complex operations, but they also help you build
        reusable components.

        Create a program that determines the complexity of a given password based on these rules:

        A very weak password contains only numbers and is fewer than eight characters.
        A weak password contains only letters and is fewer than eight characters.
        A strong password contains letters and at least one number and is at least eight characters.
        A very strong password contains letters, numbers, and special characters and is at least
        eight characters.

        Example Output
        The password '12345' is a very weak password.
        The password 'abcdef' is a weak password.
        The password 'abc123xyz' is a strong password.
        The password '1337h@xor!' is a very strong password.
        Constraints
        Create a passwordValidator function that takes in the password as its argument and returns a value you
        can evaluate to determine the password strength. Do not have the function return
        a string—you may need to support multiple languages in the future.
        Use a single output statement.
*/
package ex25;

import java.util.Scanner;

public class PasswordStrengthCheck {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your password?");
        String password = input.nextLine();
        int magicNumber = passwordStrength(password);
        System.out.println(PasswordStrengthDetermination(magicNumber, password));

    }
    public static String PasswordStrengthDetermination(int magicNumber, String password){
        if (magicNumber == 1){
            return "The password " + "'"+ password + "'"+ " is a very weak password.";
        }
        else if (magicNumber == 2){
            return "The password " + "'"+ password + "'"+ " is a  weak password.";
        }
        else if (magicNumber == 3){
            return "The password " + "'"+ password + "'"+ " is a strong password.";
        }
        else if (magicNumber == 4){
            return "The password " + "'"+ password + "'"+ " is a very strong password.";
        } else {
            return "The password is cool.";
        }

    }

    public static int passwordStrength(String password){
        boolean size = false, letters = false, special = false, numbers = false;
        if (password.length()>= 8){
             size = true;
        }
        for(char c : password.toCharArray()){
            if (Character.isAlphabetic(c)) {letters = true;}
            else if (Character.isDigit(c)) {numbers = true;}
            else {special = true;}
        }
        if (!size && !letters && !special && numbers){
            return 1; //very weak
        }
        else if (!size && letters && !special && !numbers){
            return 2; //weak
        }
        else if (size && letters && !special && numbers){
            return 3; //strong
        }
        else if (size && letters && special && numbers){
            return 4; //very strong
        }else {
            return 1;
        }
    }

}
