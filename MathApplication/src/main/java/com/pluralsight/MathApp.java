package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        /*1. Create two variables to represent the salary for Bob and Gary, name them
bobSalary and garySalary. Create a new variable named
highestSalary. Determine whose salary is greater using Math.max() and
store the answer in highestSalary. Set the initial salary variables to any value
you want. Print the answer (i.e "The highest salary is ...")
2. Find and display the smallest of two variables named carPrice and
truckPrice. Set the variables to any value you want.
3. Find and display the area of a circle whose radius is 7.25
4. Find and display the square root a variable after it is set to 5.0
5. Find and display the distance between the points (5, 10) and (85, 50)
6. Find and display the absolute (positive) value of a variable after it is set to -3.8
7. Find and display a random number between 0 and 1
Step 2
Push your changes to GitHub (always stage, commit and push your changes)
1. git add -A
2. git commit -m "completed Mod3 Exercise 2 - MathApp"
3. git push origin main
*/
     // Question 1
        int bobsSalary = 83200;
        int garysSalary = 68500;
        int highestSalary = Math.max(garysSalary, bobsSalary);
        String salaryString = "The highest salary is";
        System.out.println(salaryString);
        System.out.println(highestSalary);
    // Question 2
        int truckPrice = 113500;
        int carPrice = 45900;
        int cheapestOption = Math.min(truckPrice,carPrice);
        String cheapString = "The cheaper option is";
        System.out.println(cheapString);
        System.out.println(cheapestOption);
    //Question 3
        float radius = 7.25f;
        double pie = 3.1415926535;
        double areaSolved = Math.pow(radius, 2) * pie;
        String answerForarea = "The area of the circle is";
        System.out.println(answerForarea);
        System.out.println(areaSolved);
    //Question 4
        float rootVariable = 5.0f;
        float rootOfSetVariable = (float) Math.pow(rootVariable, 2f);
        String rootString = "The root of the set variable 5.0 is";
        System.out.println(rootString);
        System.out.println(rootOfSetVariable);





    }
}
