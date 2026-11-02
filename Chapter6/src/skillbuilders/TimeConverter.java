/*
 * Program: TimeConverter.java
 * Last Date of this Revision: November 2, 2026
 * Purpose: Convert between hours, minutes, and days.
 * School: CHHS
 * Course: Computer Programming 20
 */
package skillbuilders;

import java.util.Scanner;

public class TimeConverter
{
    private static final int MINUTES_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;

    /** pre: hours >= 0; post: the equivalent minutes are returned. */
    public static double hoursToMinutes(double hours)
    {
        return hours * MINUTES_PER_HOUR;
    }

    /** pre: days >= 0; post: the equivalent hours are returned. */
    public static double daysToHours(double days)
    {
        return days * HOURS_PER_DAY;
    }

    /** pre: minutes >= 0; post: the equivalent hours are returned. */
    public static double minutesToHours(double minutes)
    {
        return minutes / MINUTES_PER_HOUR;
    }

    /** pre: hours >= 0; post: the equivalent days are returned. */
    public static double hoursToDays(double hours)
    {
        return hours / HOURS_PER_DAY;
    }

    /** pre: none; post: the chosen time conversion is displayed. */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Hours to minutes");
        System.out.println("2. Days to hours");
        System.out.println("3. Minutes to hours");
        System.out.println("4. Hours to days");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        while (choice < 1 || choice > 4)
        {
            System.out.print("Choose 1 through 4: ");
            choice = input.nextInt();
        }
        System.out.print("Enter the time: ");
        double time = input.nextDouble();
        while (time < 0)
        {
            System.out.print("Enter a non-negative time: ");
            time = input.nextDouble();
        }

        double result;
        String unit;
        if (choice == 1)
        {
            result = hoursToMinutes(time);
            unit = "minutes";
        }
        else if (choice == 2)
        {
            result = daysToHours(time);
            unit = "hours";
        }
        else if (choice == 3)
        {
            result = minutesToHours(time);
            unit = "hours";
        }
        else
        {
            result = hoursToDays(time);
            unit = "days";
        }

        System.out.println("Converted time: " + result + " " + unit);
        input.close();
    }
}

/* Screen Dump

1. Hours to minutes
2. Days to hours
3. Minutes to hours
4. Hours to days
Enter your choice: 3
Enter the time: 90
Converted time: 1.5 hours

 */
