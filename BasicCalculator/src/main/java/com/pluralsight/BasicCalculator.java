package com.pluralsight;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double total = input.nextDouble();
        System.out.println("Enter second number");
        double total2 = input.nextDouble();
        double answer = (total * total2);
        System.out.printf("Your calculated total is %.2f", answer);
    }
}
