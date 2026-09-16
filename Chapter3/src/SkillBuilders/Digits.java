package SkillBuilders;

import java.util.Scanner;

/*
 * Programmer: Taj Sood
 * Date: September 16, 2026
 * Program: Digits
 * Purpose: Display the tens-place and ones-place digits of a two-digit number.
 */
public class Digits
{

    /**
     * Returns the tens-place digit of a number.
     *
     * @param number the number to examine
     * @return the tens-place digit
     */
    public static int getTensDigit(int number)
    {
        return Math.abs(number) / 10 % 10;
    }

    /**
     * Returns the ones-place digit of a number.
     *
     * @param number the number to examine
     * @return the ones-place digit
     */
    public static int getOnesDigit(int number)
    {
        return Math.abs(number) % 10;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int number = input.nextInt();

        System.out.println("The tens-place digit is: " + getTensDigit(number));
        System.out.println("The ones-place digit is: " + getOnesDigit(number));

        input.close();
    }

}
