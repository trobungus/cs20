package Exercises;

import java.util.Scanner;

/*
 * Date: September 29, 2026
 * Program: Grade
 * Purpose: Display the letter grade for a percentage.
 */
public class Grade
{

    /**
     * Converts a percentage to a letter grade.
     *
     * @param percentage the percentage earned
     * @return the matching letter grade
     */
    public static String getLetterGrade(double percentage)
    {
        if (percentage < 0 || percentage > 100)
        {
            return "Invalid percentage";
        }
        else if (percentage >= 90)
        {
            return "A";
        }
        else if (percentage >= 80)
        {
            return "B";
        }
        else if (percentage >= 70)
        {
            return "C";
        }
        else if (percentage >= 60)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the percentage: ");
        double percentage = input.nextDouble();

        String grade = getLetterGrade(percentage);
        if (grade.equals("Invalid percentage"))
        {
            System.out.println(grade + ".");
        }
        else
        {
            System.out.println("The corresponding letter grade is: " + grade);
        }

        input.close();
    }

}
