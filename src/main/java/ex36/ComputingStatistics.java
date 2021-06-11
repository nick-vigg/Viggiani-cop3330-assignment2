package ex36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Viggiani
package ex36;
Exercise 36 - Computing Statistics
Statistics is important in our field. When measuring response times or rendering times,
it’s helpful to collect data so you can easily spot abnormalities.
For example, the standard deviation helps you determine which values are outliers and
which values are within normal ranges.

Write a program that prompts for response times from a website in milliseconds.
It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time,
and the population standard deviation.

Example Output
Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55
Constraints
Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
 */
public class ComputingStatistics {
    public static final Scanner input = new Scanner(System.in);

    public static List<String> numberEntry(List<String> numbers) {
        System.out.println("Enter a number: ");
        String number = input.next();
        while (!number.equals("done")) {
            numbers.add(number);
            System.out.println("Enter a number: ");
            number = input.next();
        }
        return numbers;
    }
    public static double Average(List<String> numbers){
        double sum = 0;
        for(int i = 0; i < numbers.size(); i++){
             sum+= Double.parseDouble(numbers.get(i));
        }
        return sum / numbers.size();
    }
    public static int Minimum(List<String> numbers){
        int min = Integer.parseInt(numbers.get(0));
        for(int i =0; i < numbers.size(); i++){
            min = Math.min(min, Integer.parseInt(numbers.get(i)));
        }
        return min;
    }
    public static int Maximum(List<String> numbers){
        int max = Integer.parseInt(numbers.get(0));
        for(int i =0; i < numbers.size(); i++){
            max = Math.max(max, Integer.parseInt(numbers.get(i)));
        }
        return max;
    }
    public static double StandardDeviation(List<String> numbers){
        double avg = Average(numbers);
        double summation = 0.0;

        for (String x : numbers)
            summation += Math.pow(Integer.parseInt(x) - avg, 2);

        return Math.sqrt(1.0 * summation / numbers.size());
    }

    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers = numberEntry(numbers);
        System.out.println(String.format("The average is %.1f", Average(numbers)));
        System.out.println(String.format("The minimum is %d",Minimum(numbers)));
        System.out.println(String.format("The maximum is %d", Maximum(numbers)));
        System.out.println(String.format("The standard deviation is %.2f ",StandardDeviation(numbers)));
        
    }
}
