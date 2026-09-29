package SkillBuilders;

import java.util.Scanner;

/*
 * Date: September 29, 2026
 * Program: RandomNum
 * Purpose: Display a random integer between two values entered by the user.
 */
public class RandomNum
{

    /**
     * Generates an integer between the minimum and maximum values, inclusive.
     *
     * @param minimum the lowest possible value
     * @param maximum the highest possible value
     * @return a random integer in the requested range
     */
    public static int generateNumber(int minimum, int maximum)
    {
        if (minimum > maximum)
        {
            int temporary = minimum;
            minimum = maximum;
            maximum = temporary;
        }

        return (int) ((maximum - minimum + 1) * Math.random() + minimum);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the minimum value: ");
        int minimum = input.nextInt();

        System.out.print("Enter the maximum value: ");
        int maximum = input.nextInt();

        System.out.println("Random number: " + generateNumber(minimum, maximum));

        input.close();
    }

}
