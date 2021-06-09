/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Viggiani
 *
Exercise 27 - Validating Inputs
Large functions aren’t very usable or maintainable.
It makes a lot of sense to break down the logic of a program into smaller functions
that do one thing each. The program can then call these functions in sequence to perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code.
Ensure that the input is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter an employee ID: A12-1234
"J" is not a valid first name. It is too short.
The last name must be filled in.
The ZIP code must be numeric.
A12-1234 is not a valid ID.
Or

Enter the first name: Jimmy
Enter the last name: James
Enter the ZIP code: 55555
Enter an employee ID: TK-421
There were no errors found.
 */
package ex27;

import java.util.Scanner;

public class ValidatingInputs {

    private static final Scanner input = new Scanner(System.in);

    public static boolean validateFirstName(String firstName){
        if(firstName.isEmpty()){
            System.out.println("The first name must be filled in.");
            return false;
        }
        else if(firstName.length() <= 2){
            System.out.println('"'+firstName+'"'+" is not a valid first name. It is too short.");
            return false;
        } else {
            return true;
        }
    }
    public static boolean validateLastName(String lastName){
        if(lastName.isEmpty()){
            System.out.println("The last name must be filled in.");
            return false;
        }
        else if(lastName.length() <= 2){
            System.out.println('"'+lastName+'"'+" is not a valid last name. It is too short.");
            return false;
        } else {
            return true;
        }
    }
    public static boolean validateEmployeeZIP(String employeeZIP){
        if(employeeZIP.isEmpty()){
            System.out.println("The ZIP must be filled in.");
            return false;
        }
        for (int i =0; i < employeeZIP.length(); i++){
            if(!(Character.isDigit(employeeZIP.charAt(i)))){
                System.out.println("Zipcode must be numeric.");
                return false;
            }
        }
        return true;
    }
    public static boolean validateEmployeeID(String employeeID) {
        if(employeeID.isEmpty()){
            System.out.println("The ID must be filled in.");
            return false;
        }
        if (employeeID.length() < 6) {
            System.out.println('"' + employeeID + '"' + " is not a valid ID.");
            return false;
        }
        if (!(Character.isAlphabetic(employeeID.charAt(0)))) {
        } else if (!(Character.isAlphabetic(employeeID.charAt(1)))) {
        } else if (!(employeeID.charAt(2) == '-')) {
        } else if (!(Character.isDigit(employeeID.charAt(3)))) {
        } else if (!(Character.isDigit(employeeID.charAt(4)))) {
        } else if (!(Character.isDigit(employeeID.charAt(5)))) {
        } else if (!(Character.isDigit(employeeID.charAt(6)))) {
            return false;
        }
        return true;
    }

    public static boolean validateInput(String firstName, String lastName,
                                        String employeeZIP, String employeeID){
        boolean first = validateFirstName(firstName);
        boolean last = validateLastName(lastName);
        boolean zip = validateEmployeeZIP(employeeZIP);
        boolean id = validateEmployeeID(employeeID);

        if(first && last && zip && id){
            System.out.println("There were no errors found.");
            return true;
        }
            return false;

    }


    public static void main(String[] args) {
        System.out.println("Enter the first name:");
        String firstName = input.nextLine();
        System.out.println("Enter the last name:");
        String lastName = input.nextLine();
        System.out.println("Enter the ZIP code:");
        String employeeZIP = input.nextLine();
        System.out.println("Enter an employee ID:");
        String employeeID = input.nextLine();

        validateInput(firstName, lastName, employeeZIP, employeeID);


    }

}
