/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Viggiani
 Exercise 34 - Employee List Removal
Sometimes you have to locate and remove an entry from a list based on some criteria.
You may have a deck of cards and need to discard one so it’s no longer in play,
or you may need to remove values from a list of valid inputs once they’ve been used.
Storing the values in an array makes this process easier. Depending on your language,
you may find it safer and more efficient to create a new array instead of modifying the existing one.

Create a small program that contains a list of employee names.
Print out the list of names when the program runs the first time.
Prompt for an employee name and remove that specific name from the list of names.
Display the remaining employees, each on its own line.

Example Output
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin

Enter an employee name to remove: Chris Jones

There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin
 */
package ex34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeListRemoval {
    private static final Scanner input = new Scanner(System.in);

    public static void listEmployees(List employees){
        System.out.println(String.format("There are %d employees: ", employees.size()));
        for (int i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i));
        }
    }

    public static List removeEmployee(List<String> employees, String employee){
        for (int i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i));
            if (employees.get(i).equals(employee)){
                employees.remove(i);
                return employees;
            }
        }
        return employees;
    }

    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        System.out.println("Enter an employee name to remove: ");
        String employee = input.nextLine();
        listEmployees(employees);
        listEmployees(removeEmployee(employees, employee));
    }
}
