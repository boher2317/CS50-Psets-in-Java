package com.cs50psets.greedy;

import java.util.Scanner;

public class Greedy {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("How much change do you need?\n");
        float change = getChange();

        while (change <= 0)
        {
            System.out.print("Please enter an amount greater than 0: \n");
            change = getChange();
        }

        // convert change to cents only, declare coins.

        int cents = Math.round(change * 100);
        int coins = 0;

        // take out q's, d's, n's and p's and count coins

        while ((cents - 25) >= 0)
        {
            cents = (cents - 25);
            coins++;
        }

        while ((cents - 10) >= 0)
        {
            cents = (cents - 10);
            coins++;
        }

        while ((cents - 5) >= 0)
        {
            cents = (cents - 5);
            coins++;
        }

        while ((cents - 1) >= 0)
        {
            cents = (cents - 1);
            coins++;
        }

        System.out.println("You get " + coins + " coins back.");
    }

    public static float getChange()
    {
        while (!sc.hasNextFloat())
        {
            sc.nextLine();  // eats any invalid input to clear stream
            System.out.print("\nThat's not a valid entry! Try again: ");
        }

        return sc.nextFloat();
    }

}
