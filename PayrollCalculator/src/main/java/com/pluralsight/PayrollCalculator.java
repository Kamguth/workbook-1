package com.pluralsight;
import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter name");
        String name = input.nextLine();
        System.out.println("Please enter hours worked");
        double hoursWorked = input.nextDouble();
        System.out.println("Please enter pay rate");
        double wage = input.nextDouble();

        double grossPay = (hoursWorked * wage);
        System.out.printf(name + " your gross pay is " + grossPay);



    }
}
