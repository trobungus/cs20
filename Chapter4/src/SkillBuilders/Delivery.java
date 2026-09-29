package SkillBuilders;

import java.util.Scanner;

/*
 * Date: September 29, 2026
 * Program: Delivery
 * Purpose: Accept or reject a package based on its dimensions.
 */
public class Delivery
{

    /**
     * Checks whether all three package dimensions are 10 or less.
     *
     * @param length the package length
     * @param width the package width
     * @param height the package height
     * @return Accept when the package fits, otherwise Reject
     */
    public static String getResult(double length, double width, double height)
    {
        if (length > 10 || width > 10 || height > 10)
        {
            return "Reject";
        }
        else
        {
            return "Accept";
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the package length: ");
        double length = input.nextDouble();

        System.out.print("Enter the package width: ");
        double width = input.nextDouble();

        System.out.print("Enter the package height: ");
        double height = input.nextDouble();

        System.out.println(getResult(length, width, height));

        input.close();
    }

}
