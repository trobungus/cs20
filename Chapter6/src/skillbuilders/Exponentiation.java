/*
 * Program: Exponentiation.java
 * Last Date of this Revision: November 2, 2026
 * Purpose: Raise the first number to the power of the second number.
 * School: CHHS
 * Course: Computer Programming 20
 */
package skillbuilders;

import java.util.Scanner;

public class Exponentiation
{
    /** pre: the result is a real number; post: base raised to exponent is returned. */
    public static double powerOf(double base, double exponent)
    {
        return Math.pow(base, exponent);
    }

    /** pre: input gives a real result; post: the calculated power is displayed. */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double base = input.nextDouble();
        System.out.print("Enter the second number: ");
        double exponent = input.nextDouble();

        double result = powerOf(base, exponent);

        System.out.println(base + " raised to " + exponent + " is " + result);
        input.close();
    }
}

/* Screen Dump

Enter the first number: 2
Enter the second number: 3
2.0 raised to 3.0 is 8.0

 */
