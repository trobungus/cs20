/*
 * Program: AddCoins.java
 * Last Date of this Revision: November 2, 2026
 * Purpose: Exercise 5: calculate the dollar value of four types of coins.
 * School: CHHS
 * Course: Computer Programming 20
 */
package mastery;

import java.util.Locale;
import java.util.Scanner;

public class AddCoins
{
    private static final int CENTS_PER_NICKEL = 5;
    private static final int CENTS_PER_DIME = 10;
    private static final int CENTS_PER_QUARTER = 25;
    private static final double CENTS_PER_DOLLAR = 100.0;

    /**
     * pre: all coin counts are non-negative.
     * post: the total is returned with a dollar sign and two decimal places.
     */
    public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters)
    {
        long totalCents = (long)pennies + (long)nickels * CENTS_PER_NICKEL
                + (long)dimes * CENTS_PER_DIME + (long)quarters * CENTS_PER_QUARTER;
        return String.format(Locale.CANADA, "$%.2f", totalCents / CENTS_PER_DOLLAR);
    }

    /** pre: input is available; post: a non-negative coin count is returned. */
    public static int readCoinCount(Scanner input, String coinName)
    {
        System.out.print(coinName + ": ");
        int count = input.nextInt();
        while (count < 0)
        {
            System.out.print("Enter a non-negative count: ");
            count = input.nextInt();
        }
        return count;
    }

    /** pre: none; post: the entered coins' total dollar value is displayed. */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your total coins:");
        int quarters = readCoinCount(input, "Quarters");
        int dimes = readCoinCount(input, "Dimes");
        int nickels = readCoinCount(input, "Nickels");
        int pennies = readCoinCount(input, "Pennies");

        String total = getDollarAmount(pennies, nickels, dimes, quarters);

        System.out.println("Total: " + total);
        input.close();
    }
}

/* Screen Dump

Enter your total coins:
Quarters: 3
Dimes: 2
Nickels: 1
Pennies: 8
Total: $1.08

 */
