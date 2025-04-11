package com.pluralsight;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /*Step 1
Prompt the user for the size of the sandwich (1 or 2):
- 1: Regular: base price $5.45
- 2: Large: base price $8.95
Prompt the user for their age:
- Student (17 years old or younger) — receive a 10% discount
- Seniors (65 years old or older) — receive a 20% discount
Display the cost of the sandwich to the screen
Step 2
Push your changes to GitHub
git add -A
git commit -m "Completed Mod4 - Exercise 1 - Sandwich Shop"
git push origin main*/

        Scanner keyboard = new Scanner(System.in);

        float base = 0f;
        float smallSize = 5.45f;
        float largeSize = 8.95f;
        float discount = 0f;





        System.out.print("Select sandwich size, 1 Regular or 2 Large: ");
        int option = keyboard.nextInt();

        if (option == 1) {
            base = smallSize;
        } else if (option == 2)  {
            base = largeSize;
        } else {
            System.out.println("Must choose a valid option between 1 and 2");
        }


        System.out.print("Would you like the sandwich loaded? 1 for yes 2 for no: ");
        int loaded = keyboard.nextInt();
        if (loaded == 1 && option ==1){
         base += 1;
        }else if (loaded == 1 && option == 2){
            base += 1.75f;
        }


        System.out.print("Enter age for discount eligibility: ");
        int age = keyboard.nextInt();

        if (age <= 17 ) {
            discount = 0.10f;

        } else if (age >= 65) {
            discount = 0.20f;
        }

        System.out.printf("Your total is: $%.2f" , base * (1-discount));





    }






    }

