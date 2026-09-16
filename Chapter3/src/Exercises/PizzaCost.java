package Exercises;

import java.util.Scanner;

/*
 * Programmer: Taj Sood
 * Date: September 16, 2026
 * Program: PizzaCost (Exercise 2)
 * Purpose: Calculate the cost of making a pizza from its diameter.
 */
public class PizzaCost
{

    private static final double LABOUR_COST = 0.75;
    private static final double RENT_COST = 1.00;
    private static final double MATERIAL_COST_PER_SQUARE_INCH = 0.05;

    /**
     * Calculates the cost of making a pizza.
     *
     * @param diameter the pizza diameter in inches
     * @return the cost of making the pizza
     */
    public static double calculateCost(double diameter)
    {
        double materialCost = MATERIAL_COST_PER_SQUARE_INCH * diameter * diameter;
        return LABOUR_COST + RENT_COST + materialCost;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the diameter of the pizza in inches: ");
        double diameter = input.nextDouble();

        System.out.printf("The cost of making the pizza is: $%.2f%n",
                calculateCost(diameter));

        input.close();
    }

}
