package Exercises;

import java.util.Scanner;

/*
 * Programmer: Taj Sood
 * Date: September 16, 2026
 * Program: TimeConversion (Exercise 8)
 * Purpose: Convert a time in minutes to hours-and-minutes format.
 */
public class TimeConversion
{

    private static final int MINUTES_PER_HOUR = 60;

    /**
     * Returns the whole hours contained in a number of minutes.
     *
     * @param totalMinutes the total time in minutes
     * @return the whole number of hours
     */
    public static int getHours(int totalMinutes)
    {
        return totalMinutes / MINUTES_PER_HOUR;
    }

    /**
     * Returns the minutes remaining after whole hours are removed.
     *
     * @param totalMinutes the total time in minutes
     * @return the remaining minutes
     */
    public static int getRemainingMinutes(int totalMinutes)
    {
        return totalMinutes % MINUTES_PER_HOUR;
    }

    /**
     * Formats minutes as hours:minutes, including a leading zero when needed.
     *
     * @param totalMinutes the total time in minutes
     * @return the formatted time
     */
    public static String formatTime(int totalMinutes)
    {
        return String.format("%d:%02d", getHours(totalMinutes),
                getRemainingMinutes(totalMinutes));
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time in minutes: ");
        int totalMinutes = input.nextInt();

        System.out.println("The time is: " + formatTime(totalMinutes));

        input.close();
    }

}
