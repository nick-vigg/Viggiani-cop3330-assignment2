/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Viggiani
 Exercise 39 - Sorting Records
When you’re looking at results, you’ll want to be able to sort
them so you can find what you’re looking for quickly or do some quick visual comparisons.

Given the following data set, create a program that sorts all employees by last name and
prints them to the screen in a tabular format.

First Name	Last Name	Position	Separation Date
John	Johnson	Manager	2016-12-31
Tou	Xiong	Software Engineer	2016-10-05
Michaela	Michaelson	District Manager	2015-12-19
Jake	Jacobson	Programmer
Jacquelyn	Jackson	DBA
Sally	Webber	Web Developer	2015-12-18


Example Output
Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |
John Johnson        | Manager           | 2016-12-31
Michaela Michaelson | District Manager  | 2015-12-19
Sally Weber         | Web Developer     | 2015-12-18
Tou Xiong           | Software Engineer | 2016-10-05
Constraint
Store the data using a list of maps.
 */
package ex39;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class SortingRecords {

    public static void main(String[] args) {

        Employees[] employeesNames = {
                new Employees("John", "Johnson", "Manager", "2016-12-31"),
                new Employees("Tou", "Xiong", "Software Engineer", "2016-10-05"),
                new Employees("Michaela", "Michaelson", "District Manager", "2015-12-19"),
                new Employees("Jake", "Jacobson", "Programmer", " "),
                new Employees("Jackquelyn", "Jackson", "DBA", " "),
                new Employees("Sally", "Webber", "Web Developer", "2015-12-18")
        };


        List<Employees> list = Arrays.asList(employeesNames);


        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);


        Function<Employees, String> byFirstName = Employees::FirstName;
        Function<Employees, String> byLastName = Employees::LastName;


        Comparator<Employees> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);


        System.out.printf(
            "%nFirst Name | Last Name  | Position             | Separation Date%n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);
    }
}

class Employees {
    private String firstName;
    private String lastName;

    private String department;
    private String separationDate;

    public Employees(String firstName, String lastName,
                     String department, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = department;
        this.separationDate = separationDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String FirstName() {
        return firstName;
    }

    // set lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String LastName() {
        return lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // get department
    public String getDepartment() {
        return department;
    }

    public void setseparationDate(String separationDate) {
        this.separationDate = separationDate;
    }

    public String Date() {
        return separationDate;
    }

    public String getName() {
        return String.format("%s %s", FirstName(), LastName());
    }

    @Override
    public String toString() {
        return String.format("%-10s | %-10s | %-20s | %-10s",
                FirstName(), LastName(), getDepartment(), Date());
    }
}

