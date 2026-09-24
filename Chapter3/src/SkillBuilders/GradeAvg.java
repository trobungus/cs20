package SkillBuilders;

import java.util.Scanner;

/*
 * Programmer: Taj Sood
 * Date: September 17, 2026
 * Program: GradeAvg
 * Purpose: Read five integer grades and display their average as a percentage.
 */
public class GradeAvg
{

    private static final int NUMBER_OF_GRADES = 5;

    /**
     * Calculates the average of a collection of grades using real division.
     *
     * @param total the sum of the grades
     * @param numberOfGrades the number of grades in the total
     * @return the arithmetic mean of the grades
     */
    public static double calculateAverage(int total, int numberOfGrades)
    {
        return (double)total / numberOfGrades;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int total = 0;

        for (int gradeNumber = 1; gradeNumber <= NUMBER_OF_GRADES; gradeNumber++)
        {
            System.out.print("Enter grade " + gradeNumber + ": ");
            total += input.nextInt();
        }

        double average = calculateAverage(total, NUMBER_OF_GRADES);
        System.out.printf("The average grade is: %.2f%%%n", average);

        input.close();
    }

}
