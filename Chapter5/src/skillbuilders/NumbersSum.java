package skillbuilders;

import java.util.Scanner;

/*
 * Date: October 11, 2026
 * Program: NumbersSum
 * Purpose: Display the numbers from 1 to a chosen number and find their sum.
 */
public class NumbersSum
{

    /**
     * Calculates the sum of the numbers from 1 to the given number.
     *
     * @param number the last number to add
     * @return the sum from 1 to number
     */
    public static int calculateSum(int number)
    {
        int sum = 0;

        for (int current = 1; current <= number; current++)
        {
            sum += current;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        while (number < 1)
        {
            System.out.print("Please enter a positive integer: ");
            number = input.nextInt();
        }

        for (int current = 1; current <= number; current++)
        {
            System.out.println(current);
        }

        System.out.println("The sum is: " + calculateSum(number));

        input.close();
    }

}
