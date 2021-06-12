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

