package com.pluralsight;
import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter name: ");
        String name = input.nextLine();
        System.out.print("Please enter hours worked: ");
        float hoursWorked = input.nextFloat();
        System.out.print("Please enter pay rate: ");
        float wage = input.nextFloat();

        System.out.println("Employee Name: " + name + ", Pay Rate: " + wage * hoursWorked);
        System.out.printf("Employee Name: %s, Pay Rate: %.2f", name, hoursWorked * wage);











    }
}
