package Exercises;

import java.util.Scanner;

/*
 * Date: September 29, 2026
 * Program: PackageCheck
 * Purpose: Check whether a delivery package is too heavy or too large.
 */
public class PackageCheck
{

    /**
     * Returns a message based on a package's weight and volume.
     *
     * @param weight the package weight in kilograms
     * @param length the package length in centimetres
     * @param width the package width in centimetres
     * @param height the package height in centimetres
     * @return the package-check result
     */
    public static String getMessage(double weight, double length,
            double width, double height)
    {
        double volume = length * width * height;
        boolean tooHeavy = weight > 27;
        boolean tooLarge = volume > 100000;

        if (tooHeavy && tooLarge)
        {
            return "Too heavy and too large.";
        }
        else if (tooHeavy)
        {
            return "Too heavy.";
        }
        else if (tooLarge)
        {
            return "Too large.";
        }
        else
        {
            return "Package accepted.";
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter package weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter package length in centimeters: ");
        double length = input.nextDouble();

        System.out.print("Enter package width in centimeters: ");
        double width = input.nextDouble();

        System.out.print("Enter package height in centimeters: ");
        double height = input.nextDouble();

        System.out.println(getMessage(weight, length, width, height));

        input.close();
    }

}
