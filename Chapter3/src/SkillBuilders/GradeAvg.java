package SkillBuilders;

import java.util.Scanner;

/*
 * Programmer: Taj Sood
 * Date: September 16, 2026
 * Program: GradeAvg
 * Purpose: Read five integer grades and display their average as a percentage.
 */
public class GradeAvg
{

    private static final int NUMBER_OF_GRADES = 5;

    /**
     * Calculates the average of a collection of grades using real division.
     *
     * @param grades the grades to average
     * @return the arithmetic mean of the grades
     */
    public static double calculateAverage(int[] grades)
    {
        int total = 0;

        for (int grade : grades)
        {
            total += grade;
        }

        return (double)total / grades.length;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] grades = new int[NUMBER_OF_GRADES];

        for (int index = 0; index < grades.length; index++)
        {
            System.out.print("Enter grade " + (index + 1) + ": ");
            grades[index] = input.nextInt();
        }

        double average = calculateAverage(grades);
        System.out.printf("The average grade is: %.2f%%%n", average);

        input.close();
    }

}
