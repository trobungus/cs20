/*
 * Program: PerfectIntegers.java
 * Last Date of this Revision: November 2, 2026
 * Purpose: Exercise 7: display all perfect integers up to 100.
 * School: CHHS
 * Course: Computer Programming 20
 */
package mastery;

public class PerfectIntegers
{
    private static final int MAXIMUM_NUMBER = 100;

    /** pre: none; post: true is returned only for a positive perfect integer. */
    public static boolean isPerfect(int number)
    {
        if (number < 2)
        {
            return false;
        }
        int factorSum = 0;
        for (int factor = 1; factor <= number / 2; factor++)
        {
            if (number % factor == 0)
            {
                factorSum += factor;
            }
        }
        return factorSum == number;
    }

    /** pre: none; post: all perfect integers from 1 through 100 are displayed. */
    public static void main(String[] args)
    {
        for (int number = 1; number <= MAXIMUM_NUMBER; number++)
        {
            if (isPerfect(number))
            {
                System.out.println(number);
            }
        }
    }
}

/* Screen Dump

6
28

 */
