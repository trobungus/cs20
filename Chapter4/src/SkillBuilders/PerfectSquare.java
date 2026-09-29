package SkillBuilders;

import java.util.Scanner;

/*
 * Date: September 29, 2026
 * Program: PerfectSquare
 * Purpose: Determine whether an integer is a perfect square.
 */
public class PerfectSquare
{

    /**
     * Determines whether an integer is a perfect square.
     *
     * @param number the integer to check
     * @return true when the number is a perfect square
     */
    public static boolean isPerfectSquare(int number)
    {
        if (number < 0)
        {
            return false;
        }

        int root = (int) Math.sqrt(number);
        return root * root == number;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (isPerfectSquare(number))
        {
            System.out.println(number + " is a perfect square.");
        }
        else
        {
            System.out.println(number + " is not a perfect square.");
        }

        input.close();
    }

}
