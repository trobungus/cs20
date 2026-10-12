/*
 * Program: DigitsSum.java      Last Date of this Revision: October 11, 2026
 *
 * Purpose: Find the sum of the digits in a non-negative integer.
 *
 * School: CHHS
 * Course: Computer Programming 20
 */
package mastery;

import java.util.Scanner;

public class DigitsSum
{

    private static final int DECIMAL_BASE = 10;

    /**
     * Calculates the sum of the digits in a non-negative integer.
     *
     * @param number the number whose digits will be added
     * @return the sum of the digits
     */
    public static int calculateDigitSum(int number)
    {
        int sum = 0;

        while (number > 0)
        {
            sum += number % DECIMAL_BASE;
            number /= DECIMAL_BASE;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        while (number < 0)
        {
            System.out.print("Please enter a non-negative integer: ");
            number = input.nextInt();
        }

        int digitSum = calculateDigitSum(number);

        System.out.println("The sum of the digits is: " + digitSum);

        input.close();
    }

}

/* Screen Dump

Enter a non-negative integer: 892
The sum of the digits is: 19

 */
