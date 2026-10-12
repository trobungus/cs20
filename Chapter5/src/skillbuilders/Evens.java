/*
 * Program: Evens.java          Last Date of this Revision: October 11, 2026
 *
 * Purpose: Display the even numbers from 1 to 20.
 *
 * School: CHHS
 * Course: Computer Programming 20
 */
package skillbuilders;

public class Evens
{

    private static final int MAXIMUM_NUMBER = 20;

    /**
     * Creates a list of the even numbers from 1 to 20.
     *
     * @return the even numbers, separated by spaces
     */
    public static String getEvenNumbers()
    {
        String numbers = "";

        for (int number = 2; number <= MAXIMUM_NUMBER; number += 2)
        {
            numbers += number;

            if (number < MAXIMUM_NUMBER)
            {
                numbers += " ";
            }
        }

        return numbers;
    }

    public static void main(String[] args)
    {
        String evenNumbers = getEvenNumbers();

        System.out.println(evenNumbers);
    }

}

/* Screen Dump

2 4 6 8 10 12 14 16 18 20

 */
