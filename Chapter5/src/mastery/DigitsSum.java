package mastery;

import java.util.Scanner;

/*
 * Date: October 11, 2026
 * Program: DigitsSum
 * Purpose: Find the sum of the digits in a non-negative integer.
 */
public class DigitsSum
{

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
            sum += number % 10;
            number /= 10;
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

        System.out.println("The sum of the digits is: "
                + calculateDigitSum(number));

        input.close();
    }

}
