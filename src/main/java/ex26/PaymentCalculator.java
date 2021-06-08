/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
package ex26;

public class PaymentCalculator {
    public static int calculateMonthsUntilPaidOff(double bal, double APR, double payment){
        double i = APR / 365;
        double monthsToPayOff = -(1/30.0) * Math.log(1 + bal/payment * (1 - (Math.pow(1 + i, 30))))
                / (Math.log(1 + i));
        monthsToPayOff = Math.ceil(monthsToPayOff);
        return (int) monthsToPayOff;

    }
}
