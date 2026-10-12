package skillbuilders;

import java.util.Scanner;

/*
 * Date: October 11, 2026
 * Program: OddSum
 * Purpose: Find the sum of the odd numbers from 1 to a chosen number.
 */
public class OddSum
{

    /**
     * Calculates the sum of the odd numbers from 1 to the given number.
     *
     * @param number the highest possible number to add
     * @return the sum of the odd numbers
     */
    public static int calculateOddSum(int number)
    {
        int sum = 0;

        for (int current = 1; current <= number; current += 2)
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

        System.out.println("The sum of the odd numbers is: "
                + calculateOddSum(number));

        input.close();
    }

}
